package com.creditagricole.ui.models

import com.creditagricole.ui.R

enum class AccountType(
    val titleRes: Int,
) {
    CREDIT_AGRICOLE_BANK(titleRes = R.string.credit_agricole),
    OTHER_BANKS(titleRes = R.string.other_banks)
}