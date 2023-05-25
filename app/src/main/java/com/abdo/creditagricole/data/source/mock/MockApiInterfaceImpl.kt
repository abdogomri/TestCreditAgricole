package com.abdo.creditagricole.data.source.mock

import android.content.Context
import com.abdo.creditagricole.data.source.network.ApiInterface
import com.abdo.creditagricole.data.source.network.models.RemoteBanksRS
import com.creditagricole.util.getMock

class MockApiInterfaceImpl(context: Context) : ApiInterface {
    private val mock: List<RemoteBanksRS> = getMock(context = context, filePath = "banks.json")
    override suspend fun getUserBanks(): List<RemoteBanksRS> {
        return mock
    }
}