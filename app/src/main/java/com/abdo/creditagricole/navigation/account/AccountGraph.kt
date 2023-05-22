package com.abdo.creditagricole.navigation.account

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.ViewModel
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.abdo.creditagricole.navigation.Screen
import com.abdo.creditagricole.navigation.root.Graph

fun NavGraphBuilder.accountNavGraph(navHostController: NavHostController) {
    navigation(
        route = Graph.ACCOUNT_GRAPH,
        startDestination = Screen.Accounts.route
    ) {
        accountsRoute(navHostController = navHostController)
        operationsRoute(navHostController = navHostController)
    }
}

fun NavGraphBuilder.accountsRoute(
    navHostController: NavHostController
) {
    composable(route = Screen.Accounts.route) {
    }
}

fun NavGraphBuilder.operationsRoute(
    navHostController: NavHostController,
) {
    composable(route = Screen.Operations.route) {
    }
}

/**
 * this extension method links the shared viewModel lifecycle to the NavGraph
 */
@Composable
inline fun <reified T : ViewModel> NavBackStackEntry.sharedViewModel(
    navController: NavHostController,
): T {
    val navGraphRoute = destination.parent?.route ?: return hiltViewModel()
    val parentEntry = remember(this) {
        navController.getBackStackEntry(navGraphRoute)
    }
    return hiltViewModel(parentEntry)
}