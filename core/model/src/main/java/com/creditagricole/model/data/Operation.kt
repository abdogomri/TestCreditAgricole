package com.creditagricole.model.data

import com.creditagricole.util.Constants.DEFAULT_CURRENCY

data class Operation(
    val operationType: OperationCategory,
    val operationTitle: String,
    val amount: String,
    val currency: String = DEFAULT_CURRENCY
)
