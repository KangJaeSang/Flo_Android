package com.example.floandroid.repository.room

import android.app.Application
import android.util.Log
import com.example.floandroid.DataBinderMapperImpl
import com.example.floandroid.model.MusicData
import com.example.floandroid.network.NetworkInterface
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

interface RoomRepository  {
    // crud 쿼리 추가
    fun getMusicList() : List<MusicData>
}