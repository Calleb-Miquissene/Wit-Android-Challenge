package com.callebdev.wit_android_challenge.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.callebdev.wit_android_challenge.network.ApiClient
import com.callebdev.wit_android_challenge.network.ApiHelper
import com.callebdev.wit_android_challenge.network.ApiService
import com.callebdev.wit_android_challenge.repositories.WeatherRepository
import com.callebdev.wit_android_challenge.utils.API_KEY
import com.callebdev.wit_android_challenge.utils.Resource
import com.callebdev.wit_android_challenge.utils.UNITS_METRIC
import kotlinx.coroutines.Dispatchers
import java.lang.Exception

class WeatherDetailsActivityViewModel(private val weatherRepository: WeatherRepository) : ViewModel() {

    fun getWeatherByCityId(id: String) = liveData(Dispatchers.IO) {
        emit(Resource.loading(null))
        try {
            emit(Resource.success(weatherRepository.getWeatherByCityId(id, API_KEY, UNITS_METRIC)))
        }catch (e: Exception) {
            emit(Resource.error(null, e.message))
        }
    }
}