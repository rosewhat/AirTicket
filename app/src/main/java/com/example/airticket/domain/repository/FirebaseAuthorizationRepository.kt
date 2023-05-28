package com.example.airticket.domain.repository

interface FirebaseAuthorizationRepository {
    suspend fun authorizationUser(email: String, password: String)
    suspend fun registrationUser(email: String, password: String)
    suspend fun checkCurrentUser()
    suspend fun signOutFromAccount()
}