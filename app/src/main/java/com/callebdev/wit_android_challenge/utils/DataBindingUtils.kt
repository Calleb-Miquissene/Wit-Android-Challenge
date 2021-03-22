package com.callebdev.wit_android_challenge.utils

import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.callebdev.wit_android_challenge.R
import java.text.SimpleDateFormat
import java.util.*


@BindingAdapter("weather_icon")
fun ImageView.setWeatherIcon(iconUrl: String?) {
    iconUrl?.let {
        Glide.with(this).load(it).into(this)
    }

}

@BindingAdapter("pressure")
fun TextView.setPressure(pressure: Int?) {
    pressure?.let {
        text = String.format("%s $pressure hpa", context.getString(R.string.text_pressure))
    }
}

@BindingAdapter("temperature")
fun TextView.setTemperature(temperature: Double?) {
    temperature?.let {
        text = String.format("${temperature.toInt()}˚")
    }
}

@BindingAdapter("date_and_time")
fun TextView.setDateAndTime(dt: Int?) {
    dt?.let {
        val date = Date(dt.toLong() * 1000)
        val dateAndTimeFormatted = SimpleDateFormat("EEEE, dd MMMM yyyy, HH:mm", Locale.getDefault())
        text = dateAndTimeFormatted.format(date)
    }
}

@BindingAdapter("sunrise")
fun TextView.setSunrise(dt: Int?) {
    dt?.let {
        val date = Date(dt.toLong() * 1000)
        val dateAndTimeFormatted = SimpleDateFormat("HH:mm", Locale.getDefault())
        text = String.format("%s ${dateAndTimeFormatted.format(date)}", context.getString(R.string.text_sunrise))
    }
}

@BindingAdapter("sunset")
fun TextView.setSunset(dt: Int?) {
    dt?.let {
        val date = Date(dt.toLong() * 1000)
        val dateAndTimeFormatted = SimpleDateFormat("HH:mm", Locale.getDefault())
        text = String.format("%s ${dateAndTimeFormatted.format(date)}", context.getString(R.string.text_sunset))
    }
}

@BindingAdapter("wind")
fun TextView.setWind(speed: Double?) {
    speed?.let {
        text = String.format("%s: $speed km/h", context.getString(R.string.text_wind))
    }
}


@BindingAdapter("humidity")
fun TextView.setHumidity(humidity: Int?) {
    humidity?.let {
        text = String.format("%s $humidity", context.getString(R.string.text_humidity))
    }
}