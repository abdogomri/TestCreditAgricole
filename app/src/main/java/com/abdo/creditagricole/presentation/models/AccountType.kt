package com.abdo.creditagricole.presentation.models

import com.abdo.creditagricole.R

enum class AccountType(
    val titleRes: Int,
) {
    CREDIT_AGRICOLE_BANK(titleRes = R.string.credit_agricole),
    OTHER_BANKS(titleRes = R.string.other_banks)
}