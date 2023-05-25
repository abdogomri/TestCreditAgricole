package com.abdo.creditagricole.navigation.account

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.navigation
import com.creditagricole.account.navigation.accountsRoute
import com.creditagricole.operations.navigation.operationsRoute
import com.creditagricole.util.Graph
import com.creditagricole.util.Screen

fun NavGraphBuilder.accountNavGraph(navHostController: NavHostController) {
    navigation(
        route = Graph.ACCOUNT_GRAPH,
        startDestination = Screen.Accounts.route
    ) {
        accountsRoute(navHostController = navHostController)
        operationsRoute(navHostController = navHostController)
    }
}
