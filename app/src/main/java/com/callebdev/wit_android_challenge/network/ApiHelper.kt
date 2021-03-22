package com.callebdev.wit_android_challenge.network

import javax.inject.Inject

class ApiHelper @Inject constructor(private val apiService: ApiService) {
    suspend fun getWeatherByCityName(cityName: String, clientApiKey: String, units: String) =
        apiService.getWeatherByCityName(cityName, clientApiKey, units)

    suspend fun getWeatherByCityId(cityId: String, clientApiKey: String, units: String) =
        apiService.getWeatherByCityId(cityId, clientApiKey, units)
}