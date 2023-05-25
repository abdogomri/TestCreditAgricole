package com.creditagricole.ui.models

import com.creditagricole.ui.util.Constants.DEFAULT_CURRENCY

data class BanksUiData(
    val bankName: String,
    val balance: Double,
    val currency: String = DEFAULT_CURRENCY,
    val accounts: List<AccountUiData>
)

