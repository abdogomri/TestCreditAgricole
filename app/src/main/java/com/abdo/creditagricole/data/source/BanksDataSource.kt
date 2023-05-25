package com.abdo.creditagricole.data.source

import com.creditagricole.network.models.RemoteBanksRS
import com.creditagricole.util.model.RequestState

interface BanksDataSource {
    suspend fun getUserBanks(): RequestState<List<RemoteBanksRS>>
}