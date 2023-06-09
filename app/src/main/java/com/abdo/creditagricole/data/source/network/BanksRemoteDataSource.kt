package com.abdo.creditagricole.data.source.network

import com.abdo.creditagricole.MyApplication
import com.abdo.creditagricole.R
import com.abdo.creditagricole.data.source.BanksDataSource
import com.abdo.creditagricole.data.source.network.models.RemoteBanksRS
import com.abdo.creditagricole.util.RequestState
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
                Exception(
                    MyApplication.appContext.getString(R.string.network_connection_problem)
                )
            )
        }
    }
}