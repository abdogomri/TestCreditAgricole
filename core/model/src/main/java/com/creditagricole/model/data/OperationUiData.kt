package com.creditagricole.model.data

import com.creditagricole.util.Constants.DEFAULT_CURRENCY
import java.time.LocalDate

data class OperationUiData(
    val balance: Double,
    val currency: String = DEFAULT_CURRENCY,
    val holderName: String,
    val accountLabel: String,
    //grouped by date & alphabetically (operation title)
    val operations: Map<LocalDate, List<Operation>>
)
