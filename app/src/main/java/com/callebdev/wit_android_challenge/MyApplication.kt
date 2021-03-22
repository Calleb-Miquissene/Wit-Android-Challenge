package com.callebdev.wit_android_challenge

import android.app.Application
import com.callebdev.wit_android_challenge.network.ApiClient
import com.callebdev.wit_android_challenge.network.ApiHelper
import com.callebdev.wit_android_challenge.repositories.WeatherRepository
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MyApplication : Application() {
    val weatherRepository = WeatherRepository(ApiHelper(ApiClient.apiService()))
}