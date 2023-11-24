package com.example.observenetworkconnection

import kotlinx.coroutines.flow.Flow

interface ConectivityObserver {

    fun observer(): Flow<Status>

    enum class Status {
        Available, Unavailable, Lost, Losing
    }
}