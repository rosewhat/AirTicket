package com.example.airticket.domain.usecases.authorization

import com.example.airticket.domain.repository.FirebaseAuthorizationRepository

class RegistrationNewUserUseCase(
    private val repository: FirebaseAuthorizationRepository
) {
    suspend operator fun invoke(emailUser: String, passwordUser: String) =
        repository.registrationUser(
            email = emailUser,
            password = passwordUser
        )
}