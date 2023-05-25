package com.creditagricole.ui.models

import androidx.annotation.StringRes
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import com.creditagricole.ui.R
import com.creditagricole.ui.components.rememberCardTravel
import com.creditagricole.ui.components.rememberFastfood
import com.creditagricole.ui.components.rememberHomeWork
import com.creditagricole.ui.components.rememberMonetizationOn
import com.creditagricole.ui.components.rememberPayments
import com.creditagricole.ui.components.rememberVideogameAsset

enum class OperationCategory(
    val iconImage: @Composable() () -> ImageVector,
    @StringRes val categoryRes: Int
) {
    LEISURE(iconImage = { rememberVideogameAsset() }, categoryRes = R.string.leisure),
    FOOD(iconImage = { rememberFastfood() }, categoryRes = R.string.food),
    TRIP(iconImage = { rememberCardTravel() }, categoryRes = R.string.trip),
    COSTS(iconImage = { rememberMonetizationOn() }, categoryRes = R.string.costs),
    ONLINE(iconImage = { rememberPayments() }, categoryRes = R.string.online),
    HOUSING(iconImage = { rememberHomeWork() }, categoryRes = R.string.housing)
}