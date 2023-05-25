package com.creditagricole.util

import android.content.Context
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

inline fun <reified T> getMock(context: Context, filePath: String): T {

    val jsonObject = loadJSONFromAssets(context, "mock_files/$filePath")
    val response = object : TypeToken<T>() {}.type
    return Gson().fromJson(jsonObject, response)

}

fun loadJSONFromAssets(context: Context, fileName: String): String {
    return context.assets.open(fileName).bufferedReader().use { reader ->
        reader.readText()
    }
}

fun limitDecimalDigits(number: Double, numberDecimalDigits: Int): Double {
    return "%.${numberDecimalDigits}f".format(number).toDouble()
}