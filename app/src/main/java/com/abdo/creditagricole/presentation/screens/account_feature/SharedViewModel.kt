package com.abdo.creditagricole.presentation.screens.account_feature

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.abdo.creditagricole.data.repository.BanksRepository
import com.abdo.creditagricole.data.source.network.mappers.toBanksUiDataMap
import com.abdo.creditagricole.presentation.models.AccountType
import com.abdo.creditagricole.presentation.models.BanksUiData
import com.abdo.creditagricole.presentation.models.OperationUiData
import com.abdo.creditagricole.presentation.screens.account_feature.operations.OperationsScreenUiState
import com.abdo.creditagricole.util.RequestState
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

}