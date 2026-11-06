package com.example.mvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val model = CounterModel()

    private val _counterData = MutableLiveData<Int>()
    val counterData: LiveData<Int> get() = _counterData

    init {
        _counterData.value = model.count
    }

    fun increment() {
        model.count++
        _counterData.value = model.count
    }
}