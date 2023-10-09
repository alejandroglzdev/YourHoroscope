package com.alejandroglzdev.yourhoroscope.domain.model

import com.alejandroglzdev.yourhoroscope.R

sealed class HoroscopeInfo(val image:Int, val name: Int) {
    data object Aquarius: HoroscopeInfo(R.drawable.aquario, R.string.aquarius)
    data object Aries:HoroscopeInfo(R.drawable.aries, R.string.aries)
    data object Cancer: HoroscopeInfo(R.drawable.cancer, R.string.cancer)
    data object Capricorn: HoroscopeInfo(R.drawable.capricornio, R.string.capricorn)
    data object Gemini: HoroscopeInfo(R.drawable.geminis, R.string.gemini)
    data object Leo: HoroscopeInfo(R.drawable.leo, R.string.leo)
    data object Libra: HoroscopeInfo(R.drawable.libra, R.string.libra)
    data object Pisces: HoroscopeInfo(R.drawable.piscis, R.string.pisces)
    data object Sagittarius: HoroscopeInfo(R.drawable.sagitario, R.string.sagittarius)
    data object Scorpio: HoroscopeInfo(R.drawable.escorpio, R.string.scorpio)
    data object Taurus: HoroscopeInfo(R.drawable.tauro, R.string.taurus)
    data object Virgo: HoroscopeInfo(R.drawable.virgo, R.string.virgo)

}
