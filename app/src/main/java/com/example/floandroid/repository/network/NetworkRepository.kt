package com.example.floandroid.repository.network

import android.app.Application
import android.util.Log
import com.example.floandroid.model.MusicData
import com.example.floandroid.network.NetworkInterface
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Call
import javax.inject.Singleton

interface NetworkRepository  {
    // 통신 api 메서드 추가
    fun getMusicList() : List<MusicData>
}