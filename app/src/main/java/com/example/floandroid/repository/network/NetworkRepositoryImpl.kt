package com.example.floandroid.repository.network

import com.example.floandroid.model.MusicData
import retrofit2.Call
import javax.inject.Inject

class NetworkRepositoryImpl @Inject constructor() : NetworkRepository{
    override fun getMusicList(): List<MusicData> {
        // 레트로핏 api 통신
        val arrayList = ArrayList<MusicData>()
        arrayList.add(MusicData("", "", "", "", "file", ""))

        return ArrayList(arrayList)
    }
}
