package com.example.floandroid.hilt

import com.example.floandroid.repository.network.NetworkRepository
import com.example.floandroid.repository.network.NetworkRepositoryImpl
import com.example.floandroid.repository.room.RoomRepository
import com.example.floandroid.repository.room.RoomRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton



@Module
@InstallIn(SingletonComponent::class)
object DiRepository  {

    @Provides
    @Singleton
    fun provideNetworkApi(): NetworkRepository{
        return NetworkRepositoryImpl()
    }

    @Provides
    @Singleton
    fun provideRoomDataBase() : RoomRepository{
        return RoomRepositoryImpl()
    }
}
