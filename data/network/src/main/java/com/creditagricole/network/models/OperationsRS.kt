package com.creditagricole.network.models

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class OperationsRS(
    @SerializedName("amount") var amount: String,
    @SerializedName("category") var category: String,
    @SerializedName("date") var date: String,
    @SerializedName("id") var id: String,
    @SerializedName("title") var title: String
)