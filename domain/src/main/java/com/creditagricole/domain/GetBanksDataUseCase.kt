package com.creditagricole.domain

import com.creditagricole.domain.mappers.toBanksUiDataMap
import com.creditagricole.model.data.AccountType
import com.creditagricole.model.data.AccountsRequestState
import com.creditagricole.model.data.BanksUiData
import com.creditagricole.network.repository.BanksRepository
import com.creditagricole.util.model.RequestState
import javax.inject.Inject

/**
 * A use case which returns the Banks Data valuable for the viewModel
 * more than data from data layer
 */
class GetBanksDataUseCase @Inject constructor(
    private val repository: BanksRepository
) {

    suspend fun getBanksData(): AccountsRequestState {
        return when (val result = repository.getUserBanks()) {
            is RequestState.Error -> {
                result
            }

            is RequestState.Success -> {
                RequestState.Success(result.data.toBanksUiDataMap())
            }

            else -> {
                RequestState.Idle
            }
        }

    }

}