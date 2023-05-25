package com.creditagricole.operations.viewmodel

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.creditagricole.domain.GetBanksDataUseCase
import com.creditagricole.model.data.AccountsRequestState
import com.creditagricole.model.data.OperationUiData
import com.creditagricole.operations.OperationsScreenUiState
import com.creditagricole.util.model.RequestState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SharedViewModel @Inject constructor(
    private val getBanksDataUseCase: GetBanksDataUseCase
) : ViewModel() {
    var accountsRequestState: AccountsRequestState by mutableStateOf(RequestState.Idle)
        private set

    var operationsScreenUiState: OperationsScreenUiState by mutableStateOf(
        OperationsScreenUiState()
    )
        private set

    fun updateOperationsUiData(operationsUiData: OperationUiData) {
        operationsScreenUiState = operationsScreenUiState.copy(
            uiData = operationsUiData
        )
    }

    init {
        getBanks()
    }

    private fun getBanks() {
        accountsRequestState = RequestState.Loading
        viewModelScope.launch(Dispatchers.IO) {
            accountsRequestState = getBanksDataUseCase.getBanksData()
        }
    }

    override fun onCleared() {
        super.onCleared()
        Log.d("sharedViewModel", "ViewModel cleared")
    }

}