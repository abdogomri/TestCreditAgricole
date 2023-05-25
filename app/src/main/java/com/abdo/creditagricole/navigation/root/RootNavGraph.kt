package com.abdo.creditagricole.navigation.root

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.abdo.creditagricole.MainScreen
import com.creditagricole.util.Graph

@Composable
fun RootNavGraph(
    startDestination: String,
    navHostController: NavHostController,
) {
    NavHost(
        navController = navHostController,
        route = Graph.ROOT_GRAPH,
        startDestination = startDestination
    ) {
        mainRoute()
    }

}

fun NavGraphBuilder.mainRoute() {
    composable(route = Graph.MAIN_GRAPH) {
        MainScreen()
    }
}
