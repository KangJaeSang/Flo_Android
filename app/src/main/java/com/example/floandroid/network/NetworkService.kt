package com.example.floandroid.network

import com.example.floandroid.model.MusicData
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface NetworkService {

    fun musicList() : List<MusicData>
}