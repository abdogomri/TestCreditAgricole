package com.abdo.creditagricole.data.repository

import com.abdo.creditagricole.data.source.BanksDataSource
import com.abdo.creditagricole.data.source.network.models.RemoteBanksRS
import com.abdo.creditagricole.util.RequestState
import javax.inject.Inject

class DefaultBanksRepository @Inject constructor(
    private val remoteDataSource: BanksDataSource
) : BanksRepository {
    override suspend fun getUserBanks(): RequestState<List<RemoteBanksRS>> {
        return remoteDataSource.getUserBanks()
    }
}