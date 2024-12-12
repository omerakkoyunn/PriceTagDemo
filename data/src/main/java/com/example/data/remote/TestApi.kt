package com.example.data.remote

import com.example.data.remote.dto.DeviceDto
import retrofit2.http.GET
import retrofit2.http.Query

interface TestApi {

    @GET("test")
    suspend fun getTestData(
        @Query("apiKey") apiKey: String = "BuildConfig.API_KEY",
    ): DeviceDto

}