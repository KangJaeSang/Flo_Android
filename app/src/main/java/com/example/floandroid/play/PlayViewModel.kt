package com.example.floandroid.play

import android.app.Application
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.floandroid.model.MusicData
import com.example.floandroid.network.NetworkService
import com.example.floandroid.repository.network.NetworkRepository
import com.example.floandroid.repository.room.RoomRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import java.net.URI
import javax.inject.Inject

@HiltViewModel
class PlayViewModel @Inject constructor(val networkRepo: NetworkRepository) : ViewModel(){
    val playLiveData : MutableLiveData<MusicData> = MutableLiveData()

}

/*
class PlayViewModel(val repository: DataRepository) : ViewModel(){

    val playLiveData : MutableLiveData<MusicData> = MutableLiveData()

     fun musicApi(uri : String){
         repository.musicList(uri)
    }

    class Factory(val application: Application) : ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return PlayViewModel(DataRepository.getInstance(application)!!) as T
        }
    }
}*/
