package com.tuwaiq.weretogo.network.weatherApi.models

data class Condition(
    val code: Int,
    val temperature: Int,
    val text: String
)