package com.creditagricole.network.models

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class RemoteBanksRS(
    @SerializedName("accounts") var accounts: List<AccountsRS>,
    @SerializedName("isCA") var isCA: Int,
    @SerializedName("name") var name: String
)