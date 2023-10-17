package com.alejandroglzdev.yourhoroscope.ui.providers

import org.junit.Assert.*
import org.junit.Test

class RandomCardProviderTest {
    @Test
    fun `getRandomCard should return a random card`() {
        //Given
        val randomCard = RandomCardProvider()

        //When
        val card = randomCard.getLuck()

        //Then
        assertNotNull(card)

    }

}