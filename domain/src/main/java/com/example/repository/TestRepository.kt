package com.example.core.domain.repository

import com.example.core.domain.model.device.DeviceModel
import com.example.core.util.Response
import kotlinx.coroutines.flow.Flow


interface TestRepository {

    fun getCoinList() : Flow<Response<DeviceModel>>

}