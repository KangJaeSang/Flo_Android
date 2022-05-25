package com.example.floandroid.network

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

object NetworkInterface {

    private const val DOMAIN = "https://grepp-programmers-challenges.s3.ap-northeast-2.amazonaws.com/"

    /*fun init(url: String): NetworkService {
        val retrofit = Retrofit.Builder()
            .baseUrl(DOMAIN.plus(url))
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        return retrofit.create(NetworkService::class.java)
    }*/
}