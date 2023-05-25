package com.creditagricole.ui.models

import com.creditagricole.ui.util.Constants.DEFAULT_CURRENCY

data class Operation(
    val operationType: OperationCategory,
    val operationTitle: String,
    val amount: String,
    val currency: String = DEFAULT_CURRENCY
)
