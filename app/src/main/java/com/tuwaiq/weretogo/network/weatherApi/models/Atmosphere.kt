package com.tuwaiq.weretogo.network.weatherApi.models

data class Atmosphere(
    val humidity: Int,
    val pressure: Double,
    val rising: Int,
    val visibility: Int
)