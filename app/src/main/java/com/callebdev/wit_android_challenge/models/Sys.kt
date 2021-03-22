package com.callebdev.wit_android_challenge.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Sys(
    @SerializedName("type") val type: Int,
    @SerializedName("id") val id: Int,
    @SerializedName("message") val message: Double,
    @SerializedName("country") val country: String,
    @SerializedName("sunrise") val sunrise: Int,
    @SerializedName("sunset") val sunset: Int
) : Parcelable
