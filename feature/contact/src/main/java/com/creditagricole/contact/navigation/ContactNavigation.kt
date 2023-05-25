package com.creditagricole.contact.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.creditagricole.contact.ContactScreen
import com.creditagricole.util.Screen

fun NavGraphBuilder.contactRoute() {
    composable(route = Screen.Contact.route) {
        ContactScreen()
    }
}