package com.example.mysampleapk

import android.content.SharedPreferences
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.Dispatchers
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlin.text.Typography.dagger

@HiltViewModel
class MainViewModel @Inject constructor(
    private val mainUseCase: MainUseCase,
    val sharedPreferences: SharedPreferences
) : ViewModel() {

    val errorToaster = MutableLiveData<String>()

    private val _initResponse = MutableLiveData<InitModel>()
    val initResponse : LiveData<InitModel> get() = _initResponse

//    fun init() = viewModelScope.launch(Dispatchers.IO) {
//        mainUseCase.init().collect{
//            BaseApiResponse(it).execute(
//                onSuccess = { response -> _initResponse.postValue(response) },
//                onError = { errorMsg -> errorToaster.postValue(errorMsg) },
//                onLoading = {
//                    Log.d("KiritoLoad ", "I'm Loading - init")
//                }
//            )
//        }
//    }

    private val _productList = MutableLiveData<ProductsModel>()
    val productList : LiveData<ProductsModel> get() = _productList

//    fun getProducts() = viewModelScope.launch(Dispatchers.IO){
//        mainUseCase.getProducts().collect{
//            BaseApiResponse(it).execute(
//                onSuccess = { response -> _productList.postValue(response) },
//                onError = { errorMsg -> errorToaster.postValue(errorMsg) },
//                onLoading = {
//                    Log.d("KiritoLoad ", "I'm Loading - getProducts ")
//                }
//            )
//        }
//    }

    private val _loginResponse = MutableLiveData<LoginModel>()
    val loginResponse : LiveData<LoginModel> get() = _loginResponse

//    fun login(loginParam: LoginParam) = viewModelScope.launch(Dispatchers.IO) {
//        mainUseCase.login(loginParam).collect{
//            BaseApiResponse(it).execute(
//                onSuccess = { response ->
//
//                    _loginResponse.postValue(response)
//                    sharedPreferences.edit().putInt("id", response.id!!).apply()
//
//                    sharedPreferences.edit().putString("token", response.token).apply()
//
//                },
//                onError = { errorMsg -> errorToaster.postValue(errorMsg) },
//                onLoading = {}
//            )
//        }
//    }
}