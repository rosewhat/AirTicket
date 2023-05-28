package com.example.airticket.domain.usecases.authorization

import com.example.airticket.domain.repository.FirebaseAuthorizationRepository

class AuthorizationUserUseCase(
    private val repository: FirebaseAuthorizationRepository
) {
    suspend operator fun invoke(emailUser: String, passwordUser: String) =
        repository.authorizationUser(
            email = emailUser,
            password = passwordUser
        )

}