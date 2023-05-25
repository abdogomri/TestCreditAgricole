package com.abdo.creditagricole.data.source.network

import android.content.Context
import com.abdo.creditagricole.BuildConfig
import com.abdo.creditagricole.data.source.mock.MockApiInterfaceImpl
import com.creditagricole.util.Constants.BASE_URL
import com.chuckerteam.chucker.api.ChuckerCollector
import com.chuckerteam.chucker.api.ChuckerInterceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiInterfaceContainer(context: Context) {
    private val builder: OkHttpClient.Builder = OkHttpClient.Builder()
    private val remoteApiInterface: ApiInterface by lazy {

        if (BuildConfig.DEBUG) {
            addInterceptors(builder = builder, context = context)
        }
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(builder.build())
            .build()
            .create(ApiInterface::class.java)
    }

    private val mockApiInterface: ApiInterface = MockApiInterfaceImpl(context = context)

    private fun addInterceptors(
        builder: OkHttpClient.Builder,
        context: Context
    ) {
        builder.addInterceptor(
            ChuckerInterceptor.Builder(context)
                .collector(ChuckerCollector(context))
                .maxContentLength(250000L)
                .redactHeaders(emptySet())
                .alwaysReadResponseBody(false)
                .build()
        )
    }

    fun provideApiInterface(): ApiInterface {
        return if (BuildConfig.FLAVOR == "MOCK_CA_") {
            mockApiInterface
        } else {
            remoteApiInterface
        }
    }
}