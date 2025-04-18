package com.example.composedemo.test1.jetpack.test1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class OneViewModel : ViewModel() {

    private val _count = MutableLiveData(0)

    val count: LiveData<Int>
        get() = _count

    fun onCountChanged(count: Int) {
        _count.postValue(count)
    }

}