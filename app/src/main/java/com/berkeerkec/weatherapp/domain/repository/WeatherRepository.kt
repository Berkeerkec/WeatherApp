package com.berkeerkec.weatherapp.domain.repository

import com.berkeerkec.weatherapp.domain.util.Resource
import com.berkeerkec.weatherapp.weather.WeatherInfo

interface WeatherRepository {

    suspend fun getWeatherData(lat: Double, long : Double) : Resource<WeatherInfo>
}