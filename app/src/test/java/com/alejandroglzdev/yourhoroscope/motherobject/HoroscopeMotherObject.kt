package com.alejandroglzdev.yourhoroscope.motherobject

import com.alejandroglzdev.yourhoroscope.data.network.response.HoroscopePredictionResponse
import com.alejandroglzdev.yourhoroscope.domain.model.HoroscopeInfo

object HoroscopeMotherObject {
    val anyResponse =
        HoroscopePredictionResponse(date = "date", horoscope = "horoscope", sign = "sign")

    val horoscopeInfoList = listOf(
        HoroscopeInfo.Aquarius,
        HoroscopeInfo.Aries,
        HoroscopeInfo.Cancer,
        HoroscopeInfo.Capricorn,
        HoroscopeInfo.Gemini,
        HoroscopeInfo.Leo,
        HoroscopeInfo.Libra,
        HoroscopeInfo.Pisces,
        HoroscopeInfo.Sagittarius,
        HoroscopeInfo.Scorpio,
        HoroscopeInfo.Taurus,
        HoroscopeInfo.Virgo
    )
}