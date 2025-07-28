package com.coderabbit.app.calculator

import org.junit.Assert.assertTrue
import org.junit.Test

class CalculatorTest {

    @Test
    fun `test add function`() {
        val calculator = Calculator()
        assertTrue(calculator.add(1,2) == 3)
    }
}