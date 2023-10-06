package com.alejandroglzdev.yourhoroscope.domain.model

import com.alejandroglzdev.yourhoroscope.R
import com.alejandroglzdev.yourhoroscope.ui.horoscope.HoroscopeViewModel

sealed class HoroscopeInfo(val image:Int, val name: Int) {
    object Aquarius: HoroscopeInfo(R.drawable.aquario, R.string.aquarius)
    object Aries:HoroscopeInfo(R.drawable.aries, R.string.aries)
    object Cancer: HoroscopeInfo(R.drawable.cancer, R.string.cancer)
    object Capricorn: HoroscopeInfo(R.drawable.capricornio, R.string.capricorn)
    object Gemini: HoroscopeInfo(R.drawable.geminis, R.string.gemini)
    object Leo: HoroscopeInfo(R.drawable.leo, R.string.leo)
    object Libra: HoroscopeInfo(R.drawable.libra, R.string.libra)
    object Pisces: HoroscopeInfo(R.drawable.piscis, R.string.pisces)
    object Sagittarius: HoroscopeInfo(R.drawable.sagitario, R.string.sagittarius)
    object Scorpio: HoroscopeInfo(R.drawable.escorpio, R.string.scorpio)
    object Taurus: HoroscopeInfo(R.drawable.tauro, R.string.taurus)
    object Virgo: HoroscopeInfo(R.drawable.virgo, R.string.virgo)

}
