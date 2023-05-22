package com.abdo.creditagricole.presentation.models

import com.abdo.creditagricole.util.Constants.DEFAULT_CURRENCY
import java.time.LocalDate

data class OperationUiData(
    val balance: Double,
    val currency: String = DEFAULT_CURRENCY,
    val holderName: String,
    //grouped by date & alphabetically (operation title)
    val operations: Map<LocalDate, List<Operation>>
)
