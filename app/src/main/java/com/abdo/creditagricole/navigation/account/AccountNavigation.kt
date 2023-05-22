package com.abdo.creditagricole.navigation.account

import com.abdo.creditagricole.navigation.account.AccountScreens.ACCOUNTS_SCREEN
import com.abdo.creditagricole.navigation.account.AccountScreens.OPERATIONS_SCREEN

/**
 * Screens used in [AccountDestinations]
 */
object AccountScreens {
    const val ACCOUNTS_SCREEN = "accounts"
    const val OPERATIONS_SCREEN = "operations"
}

/**
 * Destinations used in the [AccountGraph]
 */
object AccountDestinations {
    const val OPERATIONS_ROUTE = OPERATIONS_SCREEN
    const val ACCOUNTS_ROUTE = ACCOUNTS_SCREEN
}