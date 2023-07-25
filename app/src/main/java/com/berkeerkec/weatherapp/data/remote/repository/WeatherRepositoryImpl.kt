package com.berkeerkec.weatherapp.data.remote.repository

import com.berkeerkec.weatherapp.data.mappers.toWeatherInfo
import com.berkeerkec.weatherapp.data.remote.WeatherApi
import com.berkeerkec.weatherapp.domain.repository.WeatherRepository
import com.berkeerkec.weatherapp.domain.util.Resource
import com.berkeerkec.weatherapp.weather.WeatherInfo
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val api : WeatherApi
): WeatherRepository {

    override suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo> {
        return try {

            Resource.Success(
                data = api.getWeatherData(
                    lat = lat,
                    long = long
                ).toWeatherInfo()
            )

        }catch (e : Exception){
            e.printStackTrace()
            Resource.Error(e.message ?: "An unknown error accured")
        }
    }
}