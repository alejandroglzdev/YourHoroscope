package com.alejandroglzdev.yourhoroscope.data.providers

import com.alejandroglzdev.yourhoroscope.domain.model.HoroscopeInfo
import com.alejandroglzdev.yourhoroscope.domain.model.HoroscopeInfo.*
import javax.inject.Inject

class HoroscopeProvider @Inject constructor() {

    fun getHoroscopes(): List<HoroscopeInfo> {
        return listOf(
            Aquarius,
            Aries,
            Cancer,
            Capricorn,
            Gemini,
            Leo,
            Libra,
            Pisces,
            Sagittarius,
            Scorpio,
            Taurus,
            Virgo
        )
    }
}