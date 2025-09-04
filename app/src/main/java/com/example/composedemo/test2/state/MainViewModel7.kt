package com.example.composedemo.test2.state

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class MainViewModel7 : ViewModel() {

    private val _count = MutableStateFlow(0)
    private val _doubleCount = MutableStateFlow(0)

    val count = _count.asStateFlow()
    val doubleCount = _doubleCount.asStateFlow()

    fun incrementCount() {
        _count.value += 1
    }

    fun incrementDoubleCount() {
        _doubleCount.value += 2
    }
}


