package com.example.airticket.domain.usecases.listTicket

import com.example.airticket.domain.repository.AirRepository

class LoadTopTicketDataUseCase(
    private val repository: AirRepository
) {
    operator fun invoke() = repository.loadTopTicketDataUseCase()
}