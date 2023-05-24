package com.abdo.creditagricole.presentation.models

import com.abdo.creditagricole.util.Constants.DEFAULT_CURRENCY

data class AccountUiData(
    val accountId: String,
    val holderName: String,
    val accountLabel: String,
    val balance: Double,
    val currency: String = DEFAULT_CURRENCY,
    val operations: OperationUiData
)
