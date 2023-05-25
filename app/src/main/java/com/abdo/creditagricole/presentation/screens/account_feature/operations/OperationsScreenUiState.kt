package com.abdo.creditagricole.presentation.screens.account_feature.operations

import com.creditagricole.model.data.OperationUiData

/**
 * UiState for the Operations screen.
 */
data class OperationsScreenUiState(
    val uiData: OperationUiData = OperationUiData(
        balance = 0.0,
        currency = "",
        holderName = "",
        accountLabel = "",
        operations = mapOf(),
    )
)
