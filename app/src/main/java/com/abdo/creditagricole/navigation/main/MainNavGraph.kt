package com.abdo.creditagricole.navigation.main

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.LayoutDirection
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.abdo.creditagricole.navigation.Screen
import com.abdo.creditagricole.navigation.account.accountNavGraph
import com.abdo.creditagricole.navigation.root.Graph
import com.abdo.creditagricole.presentation.main_feature.MainScreen
import com.abdo.creditagricole.presentation.rib_feature.RibScreen
import com.abdo.creditagricole.presentation.transfer_feature.TransferScreen

@Composable
fun MainNavGraph(
    paddingValues: PaddingValues,
    navHostController: NavHostController
) {
    var padding by remember { mutableStateOf(PaddingValues()) }
    padding = paddingValues

    NavHost(
        navController = navHostController,
        route = Graph.MAIN_GRAPH,
        startDestination = Graph.ACCOUNT_GRAPH,
        modifier = Modifier
            .padding(
                bottom = paddingValues.calculateBottomPadding(),
                start = padding.calculateStartPadding(LayoutDirection.Ltr),
                end = padding.calculateEndPadding(LayoutDirection.Ltr)
            )
    ) {
        mainRoute()
        ribRoute()
        transferRout()
        accountNavGraph(navHostController = navHostController)
    }

}

fun NavGraphBuilder.ribRoute() {
    composable(route = Screen.Rib.route) {
        RibScreen()
    }
}

fun NavGraphBuilder.mainRoute() {
    composable(route = Screen.Main.route) {
        MainScreen()
    }
}

fun NavGraphBuilder.transferRout() {
    composable(route = Screen.Transfer.route) {
        TransferScreen()
    }
}