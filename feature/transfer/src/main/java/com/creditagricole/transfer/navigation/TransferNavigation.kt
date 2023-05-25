package com.creditagricole.transfer.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.creditagricole.transfer.TransferScreen
import com.creditagricole.util.Screen

fun NavGraphBuilder.transferRout() {
    composable(route = Screen.Transfer.route) {
        TransferScreen()
    }
}