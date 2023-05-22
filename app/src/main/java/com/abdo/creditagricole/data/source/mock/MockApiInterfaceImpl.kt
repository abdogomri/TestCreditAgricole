package com.abdo.creditagricole.data.source.mock

import com.abdo.creditagricole.data.source.network.ApiInterface
import com.abdo.creditagricole.data.source.network.models.RemoteBanksRS
import com.abdo.creditagricole.util.getMock

class MockApiInterfaceImpl : ApiInterface {
    override suspend fun getUserBanks(): List<RemoteBanksRS> {
        return getMock(filePath = "banks.json")
    }
}