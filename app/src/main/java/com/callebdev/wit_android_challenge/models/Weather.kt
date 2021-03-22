package com.callebdev.wit_android_challenge.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Weather(
    @SerializedName("id") val id: Int,
    @SerializedName("main") val main: String,
    @SerializedName("description") val description: String,
    @SerializedName("icon") val icon: String
) : Parcelable {
    val iconUrlType1: String get() = "https://openweathermap.org/img/wn/$icon@2x.png"
    val iconUrlType2: String get() = "https://openweathermap.org/img/w/$icon.png"
}