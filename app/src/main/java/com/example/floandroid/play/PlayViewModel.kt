package com.example.floandroid.play

import android.app.Application
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.example.floandroid.model.MusicData
import com.example.floandroid.network.NetworkService
import com.example.floandroid.repository.network.NetworkRepository
import com.example.floandroid.repository.network.NetworkRepositoryImpl
import com.example.floandroid.repository.room.RoomRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Call
import java.net.URI
import javax.inject.Inject

@HiltViewModel
class PlayViewModel @Inject constructor(private val networkRepo: NetworkRepository) : ViewModel(){
    val playLiveData : MutableLiveData<List<MusicData>> = MutableLiveData()

    fun musicList() = viewModelScope.launch {
        withContext(Dispatchers.Main){
            playLiveData.value = networkRepo.getMusicList()
            Log.d("kjs-data",playLiveData.value.toString())
        }
    }
}

