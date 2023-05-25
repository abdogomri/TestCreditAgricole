package com.creditagricole.account.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.creditagricole.account.AccountsScreen
import com.creditagricole.operations.viewmodel.SharedViewModel
import com.creditagricole.ui.components.sharedViewModel
import com.creditagricole.util.Screen

fun NavGraphBuilder.accountsRoute(
    navHostController: NavHostController
) {
    composable(route = Screen.Accounts.route) { entry ->
        val viewModel = entry.sharedViewModel<SharedViewModel>(navController = navHostController)
        val accountsScreenUiState = viewModel.accountsRequestState
        AccountsScreen(
            accountsScreenUiState = accountsScreenUiState,
            navigateToOperations = {
                viewModel.updateOperationsUiData(
                    operationsUiData = it
                )
                navHostController.navigate(Screen.Operations.route)
            }
        )
    }
}