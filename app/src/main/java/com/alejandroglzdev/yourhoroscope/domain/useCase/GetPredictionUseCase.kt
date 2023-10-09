package com.alejandroglzdev.yourhoroscope.domain.useCase

import com.alejandroglzdev.yourhoroscope.domain.Repository
import javax.inject.Inject

class GetPredictionUseCase @Inject constructor(private val repository: Repository) {

    suspend operator fun invoke(sign: String) = repository.getPrediction(sign)
}