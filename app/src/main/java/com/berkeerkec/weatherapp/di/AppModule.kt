package com.berkeerkec.weatherapp.di

import android.app.Application
import com.berkeerkec.weatherapp.data.remote.WeatherApi
import com.berkeerkec.weatherapp.domain.util.Constant.BASE_URL
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideWeatherApi() : WeatherApi{
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
            .create()
    }

    @Singleton
    @Provides
    fun provideFusedLocationProviderClient(app : Application) : FusedLocationProviderClient{
        return LocationServices.getFusedLocationProviderClient(app)
    }
}