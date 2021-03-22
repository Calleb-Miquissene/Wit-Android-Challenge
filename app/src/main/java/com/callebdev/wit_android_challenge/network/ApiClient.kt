package com.callebdev.wit_android_challenge.network

import com.callebdev.wit_android_challenge.utils.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.DefineComponent
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton

//@DefineComponent(parent = ApplicationComponent.class)

@Module
@InstallIn(SingletonComponent::class)
object ApiClient {
    private val retrofit: Retrofit
        get() {
            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }


//    val apiService: ApiService get() {
//        return retrofit.create(ApiService::class.java)
//    }

    @Provides
    @Singleton
    fun apiService(): ApiService {
        return retrofit.create(ApiService::class.java)
    }
}