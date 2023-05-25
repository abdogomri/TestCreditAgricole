package com.creditagricole.network.repository

import com.creditagricole.network.source.BanksDataSource
import com.creditagricole.network.models.RemoteBanksRS
import com.creditagricole.util.model.RequestState
import javax.inject.Inject

class DefaultBanksRepository @Inject constructor(
    private val remoteDataSource: BanksDataSource
) : BanksRepository {
    override suspend fun getUserBanks(): RequestState<List<RemoteBanksRS>> {
        return remoteDataSource.getUserBanks()
    }
}