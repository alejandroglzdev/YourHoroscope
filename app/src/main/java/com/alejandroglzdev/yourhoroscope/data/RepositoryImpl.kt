package com.alejandroglzdev.yourhoroscope.data

import android.util.Log
import com.alejandroglzdev.yourhoroscope.data.network.HoroscopeApiService
import com.alejandroglzdev.yourhoroscope.domain.Repository
import com.alejandroglzdev.yourhoroscope.domain.model.HoroscopePredictionModel
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private val apiService: HoroscopeApiService): Repository {
    override suspend fun getPrediction(sign: String): HoroscopePredictionModel? {
        runCatching { apiService.getHoroscope(sign) }
            .onSuccess { return it.toDomain() }
            .onFailure {
                Log.i("Error", "Ha ocurrido un error, ${it.message}")
            }

        return null
    }
}