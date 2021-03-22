package com.callebdev.wit_android_challenge.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Coord(
    @SerializedName("long") val long: Double,
    @SerializedName("lat") val lat: Double
) : Parcelable