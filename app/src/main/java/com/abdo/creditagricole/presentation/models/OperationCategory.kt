package com.abdo.creditagricole.presentation.models

import androidx.annotation.StringRes
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import com.abdo.creditagricole.R
import com.abdo.creditagricole.presentation.components.rememberCardTravel
import com.abdo.creditagricole.presentation.components.rememberFastfood
import com.abdo.creditagricole.presentation.components.rememberHomeWork
import com.abdo.creditagricole.presentation.components.rememberMonetizationOn
import com.abdo.creditagricole.presentation.components.rememberPayments
import com.abdo.creditagricole.presentation.components.rememberVideogameAsset

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