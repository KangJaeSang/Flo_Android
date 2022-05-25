package com.example.floandroid.repository.room

import com.example.floandroid.model.MusicData
import javax.inject.Inject

class RoomRepositoryImpl @Inject constructor() : RoomRepository{
    override fun getMusicList(): List<MusicData> {
        // room 로컬 db 쿼리
        return emptyList()
    }
}