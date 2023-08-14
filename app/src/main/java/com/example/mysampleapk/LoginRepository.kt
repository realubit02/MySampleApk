package com.example.mysampleapk

interface LoginRepository {
    suspend fun login(loginParam: LoginParam) : LoginModel
}