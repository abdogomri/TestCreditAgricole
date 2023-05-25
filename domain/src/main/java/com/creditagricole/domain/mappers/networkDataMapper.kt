package com.creditagricole.domain.mappers

import com.creditagricole.model.data.AccountType
import com.creditagricole.model.data.AccountUiData
import com.creditagricole.model.data.BanksUiData
import com.creditagricole.model.data.Operation
import com.creditagricole.model.data.OperationCategory
import com.creditagricole.model.data.OperationUiData
import com.creditagricole.network.models.AccountsRS
import com.creditagricole.network.models.OperationsRS
import com.creditagricole.network.models.RemoteBanksRS
import com.creditagricole.util.limitDecimalDigits
import java.time.Instant
import java.time.ZoneId

/**
 * This map represents the data in the screen AccountsScreen
 */
fun List<RemoteBanksRS>.toBanksUiDataMap(): Map<AccountType, List<BanksUiData>> {
    val groupedBanks = this.groupBy { remoteBanksRs ->
        remoteBanksRs.isCA == 1
    }
    return groupedBanks.map { (key, value) ->
        key.toAccountType() to value.toBanksUiData()
    }.toMap()
}

fun Boolean.toAccountType(): AccountType {
    return if (this) AccountType.CREDIT_AGRICOLE_BANK else AccountType.OTHER_BANKS
}

fun List<RemoteBanksRS>.toBanksUiData(): List<BanksUiData> {
    val result: MutableList<BanksUiData> = mutableListOf()
    this.forEach { remoteBanksRS ->
        val balance = remoteBanksRS.accounts.sumOf { accountsRs ->
            accountsRs.balance
        }
        result.add(
            BanksUiData(
                bankName = remoteBanksRS.name,
                balance = limitDecimalDigits(number = balance, numberDecimalDigits = 2),
                accounts = remoteBanksRS.accounts.toAccountUiData()
            )
        )
    }

    return result.sortedBy { banksUiData ->
        banksUiData.bankName
    }
}


fun List<AccountsRS>.toAccountUiData(): List<AccountUiData> {
    val result: MutableList<AccountUiData> = mutableListOf()
    this.forEach { accountsRs ->
        result.add(
            AccountUiData(
                accountId = accountsRs.id,
                holderName = accountsRs.holder,
                accountLabel = accountsRs.label,
                balance = accountsRs.balance,
                operations = accountsRs.operations.toOperationUiData(
                    balance = accountsRs.balance,
                    holderName = accountsRs.holder,
                    accountLabel = accountsRs.label
                )
            )
        )
    }

    return result.sortedBy { accountUiData ->
        accountUiData.holderName
    }

}

fun List<OperationsRS>.toOperationUiData(
    balance: Double,
    holderName: String,
    accountLabel: String
): OperationUiData {
    val groupedOperations = this.sortedBy {
        it.date
    }.groupBy { operationsRs ->
        Instant.ofEpochSecond(operationsRs.date.toLong())
            .atZone(ZoneId.systemDefault())
            .toLocalDate()
    }
    val operations = groupedOperations.map { (key, value) ->
        key to value.map { operationsRS -> operationsRS.toOperation() }
    }.toMap()

    return OperationUiData(
        balance = balance,
        holderName = holderName,
        accountLabel = accountLabel,
        operations = operations,
    )

}

fun OperationsRS.toOperation(): Operation {
    return Operation(
        operationTitle = this.title,
        amount = this.amount,
        operationType = OperationCategory.valueOf(this.category.uppercase())
    )
}




