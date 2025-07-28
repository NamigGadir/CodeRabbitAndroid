package com.coderabbit.app.calculator

import org.junit.Assert.assertEquals
import org.junit.Assert.assertThrows
import org.junit.Assert.assertTrue
import org.junit.Test

class CalculatorTest {

    @Test
    fun `test add function`() {
        val calculator = Calculator()
        assertTrue(calculator.add(1,2) == 3)
    }

    @Test
    fun `test add function equals`() {
        val calculator = Calculator()
        assertEquals(calculator.add(1,2) ,3)
    }

    @Test
    fun `test divide function equals`() {
        val calculator = Calculator()
        assertEquals(calculator.divide(4,2) ,2)
    }

    @Test
    fun `test divide function equals second phase`() {
        val calculator = Calculator()
        assertEquals(calculator.add(0,0) ,0)
    }

    @Test
    fun `test divide function che divide`() {
        val calculator = Calculator()
        assertThrows(ArithmeticException::class.java){
            calculator.divide(4,0)
        }
    }

    @Test
    fun `test divide function che divide zero`() {
        val calculator = Calculator()
        assertThrows(ArithmeticException::class.java){
            calculator.divide(10,0)
        }
    }

    @Test
    fun `test divide function che divide zero by 17`() {
        val calculator = Calculator()
        assertThrows(ArithmeticException::class.java){
            calculator.divide(17,0)
        }
    }
}