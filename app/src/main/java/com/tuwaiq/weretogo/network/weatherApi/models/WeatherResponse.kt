package com.tuwaiq.weretogo.network.weatherApi.models

data class WeatherResponse(
    val current_observation: CurrentObservation? = null,
    val forecasts: List<Forecast>?= null,
    val location: Location? = null
)