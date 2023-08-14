package com.example.mysampleapk

data class apiResponse(
    val success: Boolean,
    val message: String,
    val user: User // User is another data class representing user details
)

data class User(
    val id: Int,
    val username: String,
    val email: String
)

data class LoginRequest(
    val username: String,
    val password: String
)

