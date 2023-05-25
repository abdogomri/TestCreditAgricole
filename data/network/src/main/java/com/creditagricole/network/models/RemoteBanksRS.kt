package com.creditagricole.network.models

import com.google.gson.annotations.SerializedName

data class RemoteBanksRS(
    @SerializedName("accounts") var accounts: List<AccountsRS>,
    @SerializedName("isCA") var isCA: Int,
    @SerializedName("name") var name: String
)