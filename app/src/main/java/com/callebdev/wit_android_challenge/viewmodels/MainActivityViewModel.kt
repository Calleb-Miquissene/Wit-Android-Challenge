package com.callebdev.wit_android_challenge.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.callebdev.wit_android_challenge.repositories.WeatherRepository
import com.callebdev.wit_android_challenge.utils.*
import kotlinx.coroutines.Dispatchers

class MainActivityViewModel(private val weatherRepository: WeatherRepository) : ViewModel() {

    fun getMyCityWeather() = liveData(Dispatchers.IO) {
        emit(Resource.loading(null))
        try {
            emit(
                Resource.success(
                    weatherRepository.getWeatherByCityName(
                        MY_CITY_NAME,
                        API_KEY,
                        UNITS_METRIC
                    )
                )
            )
        } catch (e: Exception) {
            emit(Resource.error(null, e.message))
        }
    }

    fun getEuropeanCitiesWeather() = liveData(Dispatchers.IO) {
        emit(Resource.loading(null))
        try {
            emit(
                Resource.success(
                    weatherRepository.getWeatherByCityId(
                        EUROPEAN_CITIES,
                        API_KEY,
                        UNITS_METRIC
                    )
                )
            )
        } catch (e: Exception) {
            emit(Resource.error(null, e.message))
        }
    }
}