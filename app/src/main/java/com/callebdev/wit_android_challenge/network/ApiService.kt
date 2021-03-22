package com.callebdev.wit_android_challenge.network

import com.callebdev.wit_android_challenge.responses.WeatherDetailsResponse
import com.callebdev.wit_android_challenge.responses.WeatherResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("group")
    suspend fun getWeatherByCityId(
        @Query("id") cityId: String,
        @Query("appid") clientApiKey: String,
        @Query("units") units: String
    ): WeatherResponse

    @GET("weather")
    suspend fun getWeatherByCityName(
        @Query("q") cityName: String,
        @Query("appid") clientApiKey: String,
        @Query("units") units: String
    ): WeatherDetailsResponse
}