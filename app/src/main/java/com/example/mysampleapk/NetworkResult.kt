package com.example.mysampleapk

sealed class NetworkResult <out T>(val data : T? = null, val message : String? = null){
    class OnLoading<T> : NetworkResult<T>()
    class OnSuccess<T>(data: T) : NetworkResult<T>(data = data)
    class OnError<T>(error : String) : NetworkResult<T>(message = error)
}