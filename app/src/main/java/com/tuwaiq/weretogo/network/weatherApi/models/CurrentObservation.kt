package com.tuwaiq.weretogo.network.weatherApi.models

data class CurrentObservation(
    val astronomy: Astronomy,
    val atmosphere: Atmosphere,
    val condition: Condition,
    val pubDate: Int,
    val wind: Wind
)