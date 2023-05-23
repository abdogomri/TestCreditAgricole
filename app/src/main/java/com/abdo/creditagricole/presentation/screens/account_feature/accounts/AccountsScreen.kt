package com.abdo.creditagricole.presentation.screens.account_feature.accounts

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import com.abdo.creditagricole.navigation.Screen
import com.abdo.creditagricole.presentation.components.EmptyPage
import com.abdo.creditagricole.presentation.models.OperationUiData
import com.abdo.creditagricole.presentation.screens.account_feature.AccountsRequestState

@Composable
fun AccountsScreen(
    navigateToOperations: (OperationUiData) -> Unit,
    accountsScreenUiState: AccountsRequestState
) {
    Scaffold(
        topBar = {
            AccountsTopBar(
                titleRes = Screen.Accounts.titleResourceId,
            )
        }
    ) {
        EmptyPage()
    }
}