package com.example.trip_screen.model

data class Travel(
    val destination: String,
    var startDate: String,
    var endDate: String,
    var value: Double,
    val reason: Int
)