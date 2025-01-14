package com.example.repository

import com.example.model.device.DeviceModel
import com.example.util.Response
import kotlinx.coroutines.flow.Flow


interface TestRepository {

    fun getCoinList() : Flow<Response<DeviceModel>>

}