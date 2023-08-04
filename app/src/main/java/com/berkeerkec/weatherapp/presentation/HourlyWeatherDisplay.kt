package com.berkeerkec.weatherapp.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.berkeerkec.weatherapp.weather.WeatherData
import java.time.format.DateTimeFormatter

@Composable
fun HourlyWeatherDisplay(
    modifier: Modifier = Modifier,
    weatherData: WeatherData,
    textColor : Color = Color.White
){
    val formattedTime =  remember(weatherData) {
        weatherData.time.format(
            DateTimeFormatter.ofPattern("HH:mm")
        )
    }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = modifier
    ) {

        Text(
            text = formattedTime,
            color = Color.LightGray
        )
        Spacer(modifier = Modifier.height(16.dp))
        Image(
            painter = painterResource(id = weatherData.weatherType.iconRes),
            contentDescription = null,
            modifier = modifier.width(40.dp)

        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "${weatherData.temperatureCelcius}°C",
            color = textColor,
            fontWeight = FontWeight.Bold
        )
    }

}






