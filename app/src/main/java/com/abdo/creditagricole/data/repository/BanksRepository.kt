package com.abdo.creditagricole.data.repository

import com.abdo.creditagricole.data.source.network.models.RemoteBanksRS
import com.abdo.creditagricole.util.RequestState

/**
 * Interface to the data layer.
 */
interface BanksRepository {
    suspend fun getUserBanks(): RequestState<List<RemoteBanksRS>>

}