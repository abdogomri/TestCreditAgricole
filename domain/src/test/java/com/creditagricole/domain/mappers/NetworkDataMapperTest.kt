package com.creditagricole.domain.mappers

import com.creditagricole.model.data.AccountUiData
import com.creditagricole.model.data.Operation
import com.creditagricole.model.data.OperationCategory
import com.creditagricole.model.data.OperationUiData
import com.creditagricole.network.models.AccountsRS
import com.creditagricole.network.models.OperationsRS
import com.google.common.truth.Truth.assertThat
import org.junit.Test
import java.time.LocalDate

class NetworkDataMapperTest {
    private val operationRS1 = OperationsRS(
        amount = "100.00",
        category = "Leisure",
        date = "1684713600", //23-05-2023
        id = "op001",
        title = "Leisure Transaction"
    )

    private val operationRS2 = OperationsRS(
        amount = "50.00",
        category = "Food",
        date = "1684713600", //23-05-2023
        id = "op002",
        title = "Food Transaction"
    )

    private val operationRS3 = OperationsRS(
        amount = "50.00",
        category = "Food",
        date = "1685059200", //26-05-2023
        id = "op002",
        title = "Food Transaction"
    )

    private val accountStartingWithZ = AccountsRS(
        balance = 1000.0,
        contractNumber = "123456789",
        holder = "Z",
        id = "acc001",
        label = "Savings Account",
        operations = emptyList(),
        order = 1,
        productCode = "SAV",
        role = 1
    )

    private val accountStartingWithA = AccountsRS(
        balance = 5000.0,
        contractNumber = "987654321",
        holder = "A",
        id = "acc002",
        label = "Checking Account",
        operations = emptyList(),
        order = 2,
        productCode = "CHK",
        role = 2
    )


    // Arrange
    private val operationsRSList = mutableListOf(operationRS1, operationRS2)

    @Test
    fun testToOperation() {
        // Act
        val operation = operationRS1.toOperation()

        // Assert
        assertThat(OperationCategory.LEISURE).isEqualTo(operation.operationType)
        assertThat("Leisure Transaction").isEqualTo(operation.operationTitle)
        assertThat("100.00").isEqualTo(operation.amount)
    }


    @Test
    fun testToOperationUiData_operations_in_the_same_day_are_grouped_with_the_same_day() {
        val balance = 1000.0
        val holderName = "John Doe"
        val accountLabel = "Savings Account"

        // Act
        var operationUiData = operationsRSList.toOperationUiData(balance, holderName, accountLabel)

        // Assert
        assertThat(balance).isEqualTo(operationUiData.balance)
        assertThat(holderName).isEqualTo(operationUiData.holderName)
        assertThat(accountLabel).isEqualTo(operationUiData.accountLabel)
        assertThat(operationUiData.operations.size).isEqualTo(1)

        assertThat(operationUiData.operations[operationUiData.operations.keys.first()]).isEqualTo(
            operationUiData.operations[operationUiData.operations.keys.last()]
        )

    }

    @Test
    fun testToOperationUiData_operations_not_in_the_same_day_are_in_two_groupes() {
        val balance = 1000.0
        val holderName = "John Doe"
        val accountLabel = "Savings Account"

        operationsRSList.add(operationRS3)

        // Act
        val operationUiData = operationsRSList.toOperationUiData(balance, holderName, accountLabel)

        // Assert
        assertThat(operationUiData.operations.size).isEqualTo(2)
        assertThat(operationUiData.operations[operationUiData.operations.keys.last()]).isEqualTo(
            listOf(operationRS3.toOperation())
        )
    }


    @Test
    fun testToAccountUiData() {
        // Arrange add accounts not in order ( Z first then A)
        val accountsList = listOf(accountStartingWithZ, accountStartingWithA)

        // Act
        val accountUiDataList = accountsList.toAccountUiData()

        // Assert make sure the result is arranged alphabetically
        assertThat(accountUiDataList.size).isEqualTo(2)
        assertThat(accountUiDataList[0].holderName).isEqualTo(accountStartingWithA.holder)

        val expectedAccount1 = AccountUiData(
            accountId = "acc001",
            holderName = "John Doe",
            accountLabel = "Savings Account",
            balance = 1000.0,
            operations = OperationUiData(
                balance = 1000.0,
                holderName = "John Doe",
                accountLabel = "Savings Account",
                operations = mapOf(
                    LocalDate.now() to listOf(
                        Operation(
                            operationType = OperationCategory.LEISURE,
                            operationTitle = "Leisure Transaction",
                            amount = "100.00"
                        )
                    )
                )
            )
        )
    }
}
