package com.example.airticket.domain.models

data class AirEntity(
    val cityFrom: String,
    val cityTo: String,
    val timeFrom: String,
    val timeTo: String,
    val classTicket: String,
    val price: String,
    val flight: String,
    val transplant: String,
)
