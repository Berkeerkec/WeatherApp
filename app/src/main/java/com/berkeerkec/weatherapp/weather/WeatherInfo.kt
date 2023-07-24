package com.berkeerkec.weatherapp.weather

data class WeatherInfo(
    val weatherDataPerDay : Map<Int, List<WeatherData>>,
    val currentWeatherData : WeatherData?
)
