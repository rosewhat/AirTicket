package com.example.airticket.domain.usecases.listTicket

import com.example.airticket.domain.models.AirEntity
import com.example.airticket.domain.repository.AirRepository

class InsertTicketIntoTopListUseCase(
    private val repository: AirRepository
) {
    suspend operator fun invoke(entity: AirEntity) =
        repository.insertTicketIntoTopList(airEntity = entity)
}