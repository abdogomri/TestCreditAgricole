package com.abdo.creditagricole.presentation.screens.account_feature

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.creditagricole.network.repository.BanksRepository
import com.creditagricole.domain.mappers.toBanksUiDataMap
import com.abdo.creditagricole.presentation.screens.account_feature.operations.OperationsScreenUiState
import com.creditagricole.model.data.AccountType
import com.creditagricole.model.data.BanksUiData
import com.creditagricole.model.data.OperationUiData
import com.creditagricole.util.model.RequestState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

typealias AccountsRequestState = RequestState<Map<AccountType, List<BanksUiData>>>

@HiltViewModel
class SharedViewModel @Inject constructor(
    private val repository: BanksRepository
) : ViewModel() {
    var accountsRequestState: AccountsRequestState by mutableStateOf(RequestState.Idle)
        private set

    var operationsScreenUiState: OperationsScreenUiState by mutableStateOf(OperationsScreenUiState())
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
            val result = repository.getUserBanks()
            when (result) {
                is RequestState.Error -> {
                    accountsRequestState = result
                }

                is RequestState.Success -> {
                    accountsRequestState = RequestState.Success(result.data.toBanksUiDataMap())
                }

                else -> {}
            }
        }
    }

    override fun onCleared() {
        super.onCleared()
        Log.d("sharedViewModel", "ViewModel cleared")
    }

}