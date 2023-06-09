@file:OptIn(ExperimentalFoundationApi::class)

package com.abdo.creditagricole.presentation.screens.account_feature.accounts

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.abdo.creditagricole.presentation.components.CollapsibleBankItem
import com.abdo.creditagricole.presentation.components.EmptyPage
import com.abdo.creditagricole.presentation.models.AccountType
import com.abdo.creditagricole.presentation.models.BanksUiData
import com.abdo.creditagricole.presentation.models.OperationUiData

@Composable
fun AccountsContent(
    paddingValues: PaddingValues,
    banksMap: Map<AccountType, List<BanksUiData>>,
    onAccountClicked: (OperationUiData) -> Unit
) {
    if (banksMap.isNotEmpty()) {
        LazyColumn(
            modifier = Modifier
                .padding(horizontal = 24.dp)
                .padding(top = paddingValues.calculateTopPadding())
        ) {
            banksMap.forEach { (accountType, banks) ->
                stickyHeader(key = accountType.name) {
                    Text(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(MaterialTheme.colorScheme.surface)
                            .padding(vertical = 14.dp),
                        text = stringResource(id = accountType.titleRes),
                        style = TextStyle(
                            fontSize = MaterialTheme.typography.titleLarge.fontSize,
                            fontWeight = FontWeight.Light
                        )
                    )
                }
                items(
                    items = banks,
                ) {
                    CollapsibleBankItem(banksUiData = it, onAccountClicked = onAccountClicked)
                }
            }
        }
    } else {
        EmptyPage()
    }
}