package com.abdo.creditagricole.presentation.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.abdo.creditagricole.presentation.models.AccountUiData
import com.abdo.creditagricole.presentation.models.OperationUiData

@Composable
fun AccountItem(
    accountUiData: AccountUiData,
    onItemClicked: (OperationUiData) -> Unit
) {
    Row(
        modifier = Modifier
            .clickable { onItemClicked(accountUiData.operations) })
    {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 10.dp)
                .padding(vertical = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = accountUiData.holderName,
                style = TextStyle(fontSize = MaterialTheme.typography.bodyMedium.fontSize)
            )
            Text(
                text = "${accountUiData.balance} ${accountUiData.currency}",
                style = TextStyle(fontSize = MaterialTheme.typography.bodyMedium.fontSize)
            )
        }
    }
}

@Preview
@Composable
fun AccountItemPreview() {
    AccountItem(
        onItemClicked = {}, accountUiData = AccountUiData(
            accountId = "",
            holderName = "Thomas Henderson",
            balance = 0.0,
            operations = OperationUiData(
                balance = 0.0,
                currency = "",
                holderName = "",
                operations = mapOf()
            )
        )
    )
}