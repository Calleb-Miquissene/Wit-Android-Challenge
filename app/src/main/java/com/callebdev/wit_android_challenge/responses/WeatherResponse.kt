package com.callebdev.wit_android_challenge.responses

import com.callebdev.wit_android_challenge.results.WeatherResult
import com.google.gson.annotations.SerializedName

data class WeatherResponse(
    @SerializedName("list") val list: List<WeatherResult>
)