package com.abdo.creditagricole.data.source.network

import com.abdo.creditagricole.data.source.network.models.RemoteBanksRS
import com.abdo.creditagricole.util.Constants.USER_BANKS_END_POINT
import retrofit2.http.GET

interface ApiInterface {
    @GET(USER_BANKS_END_POINT)
    suspend fun getUserBanks(): List<RemoteBanksRS>
}