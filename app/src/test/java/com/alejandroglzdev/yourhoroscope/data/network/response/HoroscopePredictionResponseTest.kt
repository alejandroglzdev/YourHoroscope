package com.alejandroglzdev.yourhoroscope.data.network.response

import com.alejandroglzdev.yourhoroscope.motherobject.HoroscopeMotherObject
import io.kotlintest.shouldBe
import org.junit.Test

class HoroscopePredictionResponseTest {
    @Test
    fun `toDomain should return a correct Prediction Model` () {
        //Given
        val horoscopeResponse = HoroscopeMotherObject.anyResponse

        //When
        val horoscopePredictionModel = horoscopeResponse.toDomain()

        //Then
        horoscopePredictionModel.sign shouldBe  horoscopeResponse.sign
        horoscopePredictionModel.horoscope shouldBe horoscopeResponse.horoscope

    }
}