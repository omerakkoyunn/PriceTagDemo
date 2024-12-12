package com.example.data.repository

import com.example.core.domain.model.device.DeviceModel
import com.example.core.domain.repository.TestRepository
import com.example.core.util.Response
import com.example.data.mapper.toCityData
import com.example.data.remote.TestApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class TestRepositoryImpl @Inject constructor(private val api: TestApi): TestRepository  {
    override fun getCoinList(): Flow<Response<DeviceModel>> = flow {
        emit(Response.Loading)
        try {
            val response = api.getTestData()
            emit(Response.Success(response.toCityData()))
        } catch (e: Exception) {
            emit(Response.Error(e.message ?: "Something went wrong"))
        }
    }.flowOn(Dispatchers.IO)

}