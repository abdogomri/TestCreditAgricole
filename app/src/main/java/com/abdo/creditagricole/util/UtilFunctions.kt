package com.abdo.creditagricole.util

import com.abdo.creditagricole.MyApplication
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

inline fun <reified T> getMock(filePath: String): T {

    val jsonObject = loadJSONFromAssets("mock_files/$filePath")
    val response = object : TypeToken<T>() {}.type
    return Gson().fromJson(jsonObject, response)

}

fun loadJSONFromAssets(fileName: String): String {
    return MyApplication.appContext.assets.open(fileName).bufferedReader().use { reader ->
        reader.readText()
    }
}

fun limitDecimalDigits(number: Double, numberDecimalDigits: Int): Double {
    return "%.${numberDecimalDigits}f".format(number).toDouble()
}