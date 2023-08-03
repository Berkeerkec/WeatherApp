package com.berkeerkec.weatherapp.di

import com.berkeerkec.weatherapp.data.location.DefaultLocationTracker
import com.berkeerkec.weatherapp.data.remote.repository.WeatherRepositoryImpl
import com.berkeerkec.weatherapp.domain.locatiion.LocationTracker
import com.berkeerkec.weatherapp.domain.repository.WeatherRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.ExperimentalCoroutinesApi
import javax.inject.Singleton
@ExperimentalCoroutinesApi
@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Singleton
    @Binds
    abstract fun bindWeatherrepository(
        weatherRepositoryImpl: WeatherRepositoryImpl
    ) : WeatherRepository
}