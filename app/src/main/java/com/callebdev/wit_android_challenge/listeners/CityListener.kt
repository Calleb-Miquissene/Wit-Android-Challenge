package com.callebdev.wit_android_challenge.listeners

import com.callebdev.wit_android_challenge.results.WeatherResult

interface CityListener {
    fun onCityClicked(weatherResult: WeatherResult)
}