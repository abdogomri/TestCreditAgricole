package com.creditagricole.domain.mappers

import com.creditagricole.model.data.OperationCategory
import com.creditagricole.network.models.OperationsRS
import com.google.common.truth.Truth.assertThat
import org.junit.Test

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
}