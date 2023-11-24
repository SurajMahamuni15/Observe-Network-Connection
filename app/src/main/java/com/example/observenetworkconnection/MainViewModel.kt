package com.example.observenetworkconnection

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.map
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val conectivityObserver : NetworkConnectivityObserver) : ViewModel() {

    val status = conectivityObserver.observer().asLiveData(Dispatchers.IO)

}