package com.creditagricole.util

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

sealed class Screen(
    val route: String,
    @StringRes val titleResourceId: Int,
    @DrawableRes val iconResId: Int
) {
    object Accounts : Screen(
        route = "accounts",
        titleResourceId = R.string.my_accounts,
        iconResId = R.drawable.ic_balance
    )

    object Operations : Screen(
        route = "operations",
        titleResourceId = R.string.my_account_operations,
        iconResId = R.drawable.ic_balance
    )

    object Contact : Screen(
        route = "contact",
        titleResourceId = R.string.contact,
        iconResId = R.drawable.ic_contact
    )

    object Transfer : Screen(
        route = "transfer",
        titleResourceId = R.string.transfer,
        iconResId = R.drawable.ic_account
    )

    object Main : Screen(
        route = "main",
        titleResourceId = R.string.main,
        iconResId = R.drawable.ic_account
    )
}