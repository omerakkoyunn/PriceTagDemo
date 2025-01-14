package com.example.usecase

import com.example.repository.TestRepository
import javax.inject.Inject

class TestUseCase @Inject constructor(
    private val repository: TestRepository
) {

     operator fun invoke() = repository.getCoinList()
}