package com.example.composedemo.test1.jetpack.test1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class TwoViewModel constructor(defaultCount: Int) : ViewModel() {

    private val _count = MutableLiveData(defaultCount)

    val count: LiveData<Int>
        get() = _count

    fun onCountChanged(count: Int) {
        _count.postValue(count)
    }

}

class TwoViewModelFactory(private val defaultCount: Int) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return TwoViewModel(defaultCount) as T
    }

}