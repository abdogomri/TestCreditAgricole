package com.creditagricole.model.data

import com.creditagricole.util.Constants.DEFAULT_CURRENCY


data class AccountUiData(
    val accountId: String,
    val holderName: String,
    val accountLabel: String,
    val balance: Double,
    val currency: String = DEFAULT_CURRENCY,
    val operations: OperationUiData
)
