package com.example.core.domain.usecase

import com.example.core.domain.repository.TestRepository
import javax.inject.Inject

class TestUseCase @Inject constructor(
    private val repository: TestRepository
) {

     operator fun invoke() = repository.getCoinList()
}