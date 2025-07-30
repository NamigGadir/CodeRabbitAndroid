package com.coderabbit.app.calculator

import junit.framework.TestCase.assertTrue
import org.junit.Test

class CarTest {

    @Test
    fun testCar() {
        val car = Car()
        assertTrue(car.start(true))
    }
}