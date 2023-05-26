package com.creditagricole.network.models

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
@Keep
data class AccountsRS(
    @SerializedName("balance") var balance: Double,
    @SerializedName("contract_number") var contractNumber: String,
    @SerializedName("holder") var holder: String,
    @SerializedName("id") var id: String,
    @SerializedName("label") var label: String,
    @SerializedName("operations") var operations: List<OperationsRS>,
    @SerializedName("order") var order: Int,
    @SerializedName("product_code") var productCode: String,
    @SerializedName("role") var role: Int
)