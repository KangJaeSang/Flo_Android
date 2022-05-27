package com.example.floandroid.network

interface NetworkResponse {
    fun <T> onSuccess(msg: String, data : Class<T> , t : Throwable)
    fun <T> onFail (msg: String, data : Class<T> , t : Throwable)
}