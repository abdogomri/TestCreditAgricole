package com.abdo.creditagricole.data.source.network

import com.abdo.creditagricole.data.source.BanksDataSource
import com.abdo.creditagricole.data.source.network.models.RemoteBanksRS
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