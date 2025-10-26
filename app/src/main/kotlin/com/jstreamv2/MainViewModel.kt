package com.jstreamv2

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val _message = MutableLiveData("Hello JStreamV2!")
    val message: LiveData<String> = _message

    fun updateMessage(newMessage: String) {
        _message.value = newMessage
    }
}
