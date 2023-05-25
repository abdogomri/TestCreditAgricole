package com.creditagricole.network.source.network

import com.creditagricole.network.models.RemoteBanksRS
import com.creditagricole.util.Constants.USER_BANKS_END_POINT
import retrofit2.http.GET

interface ApiInterface {
    @GET(USER_BANKS_END_POINT)
    suspend fun getUserBanks(): List<RemoteBanksRS>
}