package com.example.mysampleapk

interface ProductsRepository {
    suspend fun getProducts() : ProductsModel
}