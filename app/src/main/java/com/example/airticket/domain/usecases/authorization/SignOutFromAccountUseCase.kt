package com.example.airticket.domain.usecases.authorization

import com.example.airticket.domain.repository.FirebaseAuthorizationRepository

class SignOutFromAccountUseCase(
    private val repository: FirebaseAuthorizationRepository
) {
    suspend operator fun invoke() = repository.signOutFromAccount()
}