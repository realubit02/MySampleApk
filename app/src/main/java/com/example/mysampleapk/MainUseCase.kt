package com.example.mysampleapk

import android.util.Log
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class MainUseCase @Inject constructor(
    private val initRepository: InitRepository,
    private val productsRepository: ProductsRepository,
    private val loginRepository: LoginRepository
){
    fun init() : Flow<NetworkResult<InitModel>> = flow {
        try {
            val response = initRepository.init()
            emit(NetworkResult.OnLoading())
            emit(NetworkResult.OnSuccess(response))
        }catch (e : Exception){
            emit(NetworkResult.OnError(e.message.toString()))
            Log.d( "ApiCall: ", "${e.message}")
        }
    }.flowOn(Dispatchers.IO)

    fun login(loginParam: LoginParam) : Flow<NetworkResult<LoginModel>> = flow {
        try {
            val response = loginRepository.login(loginParam)
            emit(NetworkResult.OnLoading())
            emit(NetworkResult.OnSuccess(response))
        }catch (e : Exception){
            emit(NetworkResult.OnError(e.message.toString()))
            Log.d( "ApiCall: ", "${e.message}")
        }
    }

    fun getProducts() : Flow<NetworkResult<ProductsModel>> = flow {
        try {
            val response = productsRepository.getProducts()
            Log.d( "ApiCall: ", "$response")
            emit(NetworkResult.OnSuccess(response))
        }catch (e : Exception){
            emit(NetworkResult.OnError(e.message.toString()))
            Log.d( "ApiCall: ", "${e.message}")
        }
    }.flowOn(Dispatchers.IO)

}