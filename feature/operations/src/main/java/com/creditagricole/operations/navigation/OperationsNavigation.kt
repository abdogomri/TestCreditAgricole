package com.creditagricole.operations.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.creditagricole.operations.viewmodel.SharedViewModel
import com.creditagricole.ui.components.sharedViewModel
import com.creditagricole.util.Screen

fun NavGraphBuilder.operationsRoute(
    navHostController: NavHostController,
) {
    composable(route = Screen.Operations.route) { entry ->
        val viewModel = entry.sharedViewModel<SharedViewModel>(navController = navHostController)
        val operationsScreenUiState = viewModel.operationsScreenUiState
        com.creditagricole.operations.OperationsScreen(
            operationsScreenUiState = operationsScreenUiState,
            onBackPressed = { navHostController.popBackStack() }
        )
    }
}