package com.berkeerkec.weatherapp.domain.locatiion

import android.location.Location

interface LocationTracker {
    suspend fun getCurrentLocation() : Location?
}