package com.creditagricole.model.data

import androidx.annotation.StringRes
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import com.creditagricole.model.R

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