package com.alejandroglzdev.yourhoroscope.domain

import com.alejandroglzdev.yourhoroscope.domain.model.HoroscopePredictionModel

interface Repository {
    suspend fun getPrediction(sign: String): HoroscopePredictionModel?
}