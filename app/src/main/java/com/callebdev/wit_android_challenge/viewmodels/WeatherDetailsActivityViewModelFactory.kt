package com.callebdev.wit_android_challenge.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.callebdev.wit_android_challenge.activities.WeatherDetailsActivity
import com.callebdev.wit_android_challenge.network.ApiHelper
import com.callebdev.wit_android_challenge.repositories.WeatherRepository
import java.lang.IllegalArgumentException

@Suppress("UNCHECKED_CAST")
class WeatherDetailsActivityViewModelFactory(private val weatherRepository: WeatherRepository) : ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(WeatherDetailsActivityViewModel::class.java)){
            return WeatherDetailsActivityViewModel(weatherRepository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel Class")
    }

}