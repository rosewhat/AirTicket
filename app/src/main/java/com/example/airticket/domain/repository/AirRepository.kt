package com.example.airticket.domain.repository

import androidx.lifecycle.LiveData
import com.example.airticket.domain.models.AirEntity

interface AirRepository {
    suspend fun deleteTicketFromTopList(airEntity: AirEntity)
    suspend fun insertTicketIntoTopList(airEntity: AirEntity)
    fun getTopListTicketUseCase(): LiveData<List<AirEntity>>
    fun loadTopTicketDataUseCase()
    fun getDetailInfoTicketUseCase(): LiveData<List<AirEntity>>
}