package com.callebdev.wit_android_challenge.repositories

import com.callebdev.wit_android_challenge.network.ApiHelper
import javax.inject.Inject

class WeatherRepository @Inject constructor(private val apiHelper: ApiHelper) {

    suspend fun getWeatherByCityName(cityName: String, clientApiKey: String, units: String) =
        apiHelper.getWeatherByCityName(cityName, clientApiKey, units)

    suspend fun getWeatherByCityId(cityId: String, clientApiKey: String, units: String) =
        apiHelper.getWeatherByCityId(cityId, clientApiKey, units)
}