package com.example.data.mapper

import com.example.model.device.DeviceModel
import com.example.data.remote.dto.DeviceDto


internal fun DeviceDto.toCityData(): DeviceModel {
    return DeviceModel(
        id = id,
        name = name
    )
}
