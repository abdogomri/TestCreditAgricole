package com.abdo.creditagricole.data.source.network.models

import com.google.gson.annotations.SerializedName


data class OperationsRS(
    @SerializedName("amount") var amount: String,
    @SerializedName("category") var category: String,
    @SerializedName("date") var date: String,
    @SerializedName("id") var id: String,
    @SerializedName("title") var title: String
)