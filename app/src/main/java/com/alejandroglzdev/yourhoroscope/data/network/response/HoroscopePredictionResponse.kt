package com.alejandroglzdev.yourhoroscope.data.network.response

import com.alejandroglzdev.yourhoroscope.domain.model.HoroscopePredictionModel
import com.google.gson.annotations.SerializedName

data class HoroscopePredictionResponse(
    @SerializedName("date") val date: String,
    @SerializedName("horoscope") val horoscope: String,
    @SerializedName("sign") val sign: String
) {
    fun toDomain(): HoroscopePredictionModel {
        return HoroscopePredictionModel(horoscope = horoscope, sign = sign)
    }
}