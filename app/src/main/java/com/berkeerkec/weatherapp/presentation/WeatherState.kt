package com.berkeerkec.weatherapp.presentation

import com.berkeerkec.weatherapp.weather.WeatherInfo

data class WeatherState(
    val weatherInfo : WeatherInfo? = null,
    val isLoading : Boolean = false,
    val error : String? = null
)