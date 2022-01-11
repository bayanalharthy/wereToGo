package com.tuwaiq.weretogo.network.weatherApi.models

data class Location(
    val city: String,
    val country: String,
    val lat: Double,
    val long: Double,
    val region: String,
    val timezone_id: String,
    val woeid: Int
)