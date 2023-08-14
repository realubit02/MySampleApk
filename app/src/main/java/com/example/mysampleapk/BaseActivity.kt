package com.example.mysampleapk

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.ViewDataBinding

abstract class BaseActivity <VB : ViewDataBinding>(
    private val bindingInflater : (inflater : LayoutInflater) -> VB,
) : AppCompatActivity(){

    private var _binding : VB? = null
    val binding : VB get() = _binding.let { binding ->

        when(binding){
            null -> bindingInflater(layoutInflater)
            else -> binding
        }

    }

    open fun VB.initialize(){}
    open fun VB.initObserver(){}
    open fun VB.initCall(){}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = bindingInflater(layoutInflater)
        binding.initCall()
        binding.initialize()
        binding.initObserver()
        setContentView(binding.root)
    }
}