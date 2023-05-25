package com.creditagricole.util

import com.google.common.truth.Truth.assertThat
import org.junit.Test

internal class UtilFunctionsTest {
    @Test
    fun testLimitDecimalDigits() {
        // Arrange
        val number = 10.987654
        val numberDecimalDigits = 2
        val expected = 10.99

        // Act
        val result = limitDecimalDigits(number, numberDecimalDigits)

        // Assert
        assertThat(result).isEqualTo(expected) // Specify a delta for floating-point comparisons
    }
}