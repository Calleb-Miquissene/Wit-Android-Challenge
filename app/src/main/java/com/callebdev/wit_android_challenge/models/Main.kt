package com.callebdev.wit_android_challenge.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Main(
    @SerializedName("temp") val temp: Double,
    @SerializedName("feels_like") val feelsLike: Double,
    @SerializedName("temp_min") val tempMin: Double,
    @SerializedName("temp_max") val tempMax: Double,
    @SerializedName("pressure") val pressure: Int,
    @SerializedName("humidity") val humidity: Int
) : Parcelable