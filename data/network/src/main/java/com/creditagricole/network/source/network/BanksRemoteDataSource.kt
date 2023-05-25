package com.creditagricole.network.source.network

import com.creditagricole.network.source.BanksDataSource
import com.creditagricole.network.models.RemoteBanksRS
import com.creditagricole.util.model.RequestState
import javax.inject.Inject

class BanksRemoteDataSource @Inject constructor(
    private val api: ApiInterface
) : BanksDataSource {
    override suspend fun getUserBanks(): RequestState<List<RemoteBanksRS>> {
        try {
            api.getUserBanks().let {
                return RequestState.Success(it)
            }
        } catch (e: Exception) {
            return RequestState.Error(
                Exception()
            )
        }
    }
}