package com.creditagricole.network.source.mock

import android.content.Context
import com.creditagricole.network.source.network.ApiInterface
import com.creditagricole.network.models.RemoteBanksRS
import com.creditagricole.util.getMock

class MockApiInterfaceImpl(context: Context) : ApiInterface {
    private val mock: List<RemoteBanksRS> = getMock(context = context, filePath = "banks.json")
    override suspend fun getUserBanks(): List<RemoteBanksRS> {
        return mock
    }
}