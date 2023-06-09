@file:OptIn(ExperimentalMaterial3Api::class)

package com.abdo.creditagricole.presentation.screens.account_feature.accounts

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.res.stringResource
import com.abdo.creditagricole.R
import com.abdo.creditagricole.navigation.Screen
import com.abdo.creditagricole.presentation.components.EmptyPage
import com.abdo.creditagricole.presentation.models.OperationUiData
import com.abdo.creditagricole.presentation.screens.account_feature.AccountsRequestState
import com.abdo.creditagricole.util.RequestState

@Composable
fun AccountsScreen(
    navigateToOperations: (OperationUiData) -> Unit,
    accountsScreenUiState: AccountsRequestState
) {
    val scrollBehavior = TopAppBarDefaults.exitUntilCollapsedScrollBehavior()
    Scaffold(
        modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = {
            AccountsTopBar(
                titleRes = Screen.Accounts.titleResourceId,
                scrollBehavior = scrollBehavior
            )
        },
        content = {
            when (accountsScreenUiState) {
                is RequestState.Success -> {
                    AccountsContent(
                        paddingValues = it,
                        banksMap = accountsScreenUiState.data,
                        onAccountClicked = navigateToOperations
                    )
                }

                is RequestState.Error -> {
                    EmptyPage(
                        title = stringResource(R.string.error),
                        subtitle = "${accountsScreenUiState.error.message}"
                    )
                }

                RequestState.Loading -> {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        CircularProgressIndicator()
                    }
                }

                else -> {}
            }
        }
    )
}