@file:OptIn(ExperimentalFoundationApi::class)

package com.creditagricole.operations

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.creditagricole.ui.components.DateHeader
import com.creditagricole.ui.components.EmptyPage
import com.creditagricole.ui.components.OperationItem
import com.creditagricole.ui.components.getBalanceTextStyle
import com.creditagricole.model.data.OperationUiData

@Composable
fun OperationsContent(
    paddingValues: PaddingValues,
    operationUiData: OperationUiData
) {
    val operationsMap = operationUiData.operations
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 24.dp)
            .padding(top = paddingValues.calculateTopPadding()),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(14.dp))
        Text(
            text = "${operationUiData.balance} ${operationUiData.currency}",
            style = getBalanceTextStyle(balance = operationUiData.balance).copy(
                fontSize = MaterialTheme.typography.titleLarge.fontSize,
            )
        )
        Text(
            text = operationUiData.accountLabel,
            style = TextStyle(
                fontSize = MaterialTheme.typography.titleLarge.fontSize,
                fontWeight = FontWeight.Light
            )
        )
        Text(
            text = operationUiData.holderName,
            style = TextStyle(
                fontSize = MaterialTheme.typography.titleMedium.fontSize,
            )
        )
        if (operationUiData.operations.isNotEmpty()) {
            LazyColumn() {
                operationsMap.forEach { (localDate, operations) ->
                    stickyHeader(key = localDate) {
                        DateHeader(localDate = localDate)
                    }
                    items(
                        items = operations
                    ) {
                        OperationItem(operation = it)
                    }
                }
            }
        } else {
            EmptyPage()
        }
    }
}

@Preview
@Composable
fun OperationsContentPreview() {
    OperationsContent(
        paddingValues = PaddingValues(all = 0.dp),
        operationUiData = OperationUiData(
            balance = 2067.9,
            holderName = "Corinne Martin",
            accountLabel = "Compte Mozaïc",
            operations = mapOf(),
        ),
    )
}