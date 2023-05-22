package com.abdo.creditagricole.presentation.screens.main_feature

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.abdo.creditagricole.navigation.Screen
import com.abdo.creditagricole.navigation.main.MainNavGraph
import com.abdo.creditagricole.navigation.root.Graph

@Composable
fun MainScreen(
    navHostController: NavHostController = rememberNavController(),
) {
    Scaffold(
        bottomBar = {
            BottomBar(
                navHostController = navHostController,
            )
        }
    ) {
        MainNavGraph(
            navHostController = navHostController,
            paddingValues = it
        )
    }
}

@Composable
fun BottomBar(
    navHostController: NavHostController,
) {
    var selectedScreenIndex by remember { mutableStateOf(0) }

    val entryScreens = listOf(
        Screen.Accounts,
        Screen.Rib,
        Screen.Transfer
    )
    NavigationBar {
        entryScreens.forEachIndexed { index, screen ->
            NavigationBarItem(
                selected = selectedScreenIndex == index,
                onClick = {
                    navHostController.popBackStack()
                    if (screen is Screen.Accounts) {
                        navHostController.navigate(Graph.ACCOUNT_GRAPH)
                    } else {
                        navHostController.navigate(screen.route)
                    }
                    selectedScreenIndex = index
                },
                icon = {
                    Icon(painter = painterResource(id = screen.iconResId), contentDescription = "")
                },
                label = {
                    Text(text = stringResource(id = screen.titleResourceId))
                }
            )
        }
    }
}