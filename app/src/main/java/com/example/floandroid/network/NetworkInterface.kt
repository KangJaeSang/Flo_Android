package com.example.floandroid.network

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkInterface {

    private const val DOMAIN = "https://grepp-programmers-challenges.s3.ap-northeast-2.amazonaws.com/"

    @Singleton
    @Provides
    fun provideRetrofit() : Retrofit{
        return Retrofit.Builder()
           .baseUrl(DOMAIN)
           .addConverterFactory(GsonConverterFactory.create())
           .build()
    }

    @Singleton
    @Provides
    fun provideApiservice(retrofit: Retrofit): NetworkService{
        return retrofit.create(NetworkService::class.java)
    }
}