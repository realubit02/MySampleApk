package com.example.mysampleapk

interface InitRepository {
    suspend fun init() : InitModel
}