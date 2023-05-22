package com.abdo.creditagricole.data.source

import com.abdo.creditagricole.data.source.network.models.RemoteBanksRS
import com.abdo.creditagricole.util.RequestState

interface BanksDataSource {
    suspend fun getUserBanks(): RequestState<List<RemoteBanksRS>>
}