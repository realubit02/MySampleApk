package com.example.mysampleapk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.text.Editable
import android.text.TextWatcher
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.view.View
import android.view.View.inflate
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout
import dagger.hilt.android.AndroidEntryPoint
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


//@AndroidEntryPoint
//class MainActivity : BaseActivity<ActivityMainBinding>(ActivityMainBinding::inflate), GlobalObserver {
//    private val mainViewModel : MainViewModel by viewModels()
//    override fun ActivityMainBinding.initCall() {
//        mainViewModel.init()
//    }
//    fun showHidePass(){
//        val imageView = findViewById<ImageView>(R.id.imageView)
//        val imageView2 = findViewById<ImageView>(R.id.imageView2)
//        val pwd = findViewById<EditText>(R.id.pwd)
//
//        pwd.addTextChangedListener(object : TextWatcher {
//            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
//                // Not used
//            }
//            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
//                // Show or hide the button based on the presence of text
//
//                imageView.visibility = if (s.isNullOrEmpty()) View.GONE   else View.VISIBLE
//                // imageView2.visibility = if (s.isNullOrEmpty()) View.GONE  else View.VISIBLE
//
//                imageView2.setOnClickListener {
//                    if (imageView.visibility == View.VISIBLE) {
//                        pwd.transformationMethod = HideReturnsTransformationMethod.getInstance()
//                        imageView.visibility = View.GONE
//                    } else if (imageView2.visibility == View.VISIBLE) {
//                        pwd.transformationMethod = PasswordTransformationMethod.getInstance()
//                        imageView.visibility = View.VISIBLE
//                    }
//                    else{
//                        pwd.transformationMethod = PasswordTransformationMethod.getInstance()
//                    }
//                }
//            }
//            override fun afterTextChanged(s: Editable?) {
//                // Not used
//            }
//        })
//
//    }
//    fun function(){
//
//
//        val loginRequest = LoginRequest("yourUsername", "yourPassword")
//        val loginbut = findViewById<Button>(R.id.Login)
//        loginbut.setOnClickListener(){
//        val apiService = RetrofitInstance.retrofit.create(APIServices::class.java)
//        apiService.loginUser(loginRequest.username, loginRequest.password)
//            .enqueue(object : Callback<apiResponse> {
//                override fun onResponse(call: Call<apiResponse>, response: Response<apiResponse>) {
//                    val apiResponse = response.body()
//                    if (apiResponse != null && apiResponse.success) {
//                        val user = apiResponse.user
//                        // Handle successful login
//                    } else {
//                        val message = apiResponse?.message ?: "Login failed"
//                        // Handle login failure
//                    }
//                }
//
//                override fun onFailure(call: Call<apiResponse>, t: Throwable) {
//                    // Handle network error
//                }
//            })
//        }
//    }
//    fun hide() {
//        val myLinearLayout = findViewById<LinearLayout>(R.id.signuplinear)
//        val mainlinearbase = findViewById<LinearLayout>(R.id.linearbase)
//        val signbackbut = findViewById<Button>(R.id.signbbutton)
//        signbackbut.setOnClickListener() {
//            mainlinearbase.visibility = View.VISIBLE
//            myLinearLayout.visibility = View.GONE
//        }
//    }
//    fun signupp(){
//        val signuplinear = findViewById<LinearLayout>(R.id.signuplinear)
//        val Signupbut = findViewById<Button>(R.id.signupbutinmain)
//        val mainlinearbase = findViewById<LinearLayout>(R.id.linearbase)
//        Signupbut.setOnClickListener {
//            mainlinearbase.visibility = View.GONE
//            signuplinear.visibility = View.VISIBLE
//            validateSignupCpassword()
//        }
//    }
//    fun signbackbutton(){
//        val signbbutton = findViewById<Button>(R.id.signbbutton)
//        signbbutton.setOnClickListener(){
//            hide()
//        }
//    }
//    fun validateSignupCpassword(){
//        val signupcpass = findViewById<EditText>(R.id.signUpCpassword)
//        val signuppass = findViewById<EditText>(R.id.signUppassword)
//        val signupbut = findViewById<Button>(R.id.butinsignup)
//        if (signupcpass.text != signuppass.text){
//            signupbut.isEnabled = false
//        }else{
//            signupbut.isActivated = true
//        }
//    }
//    fun verifytimer(){
//        val vtimerbutton =  findViewById<Button>(R.id.verify)
//        vtimerbutton.setOnClickListener(){
//            object : CountDownTimer(60000, 1000) {
//                override fun onTick(millisUntilFinished: Long) {
//                    vtimerbutton.text = (millisUntilFinished / 1000).toString()
//                }
//                override fun onFinish() {
//                    vtimerbutton.text = "Resend"
//                    vtimerbutton.isClickable = true
//                }
//            }.start()
//            vtimerbutton.isClickable = false
//        }
//    }
//}