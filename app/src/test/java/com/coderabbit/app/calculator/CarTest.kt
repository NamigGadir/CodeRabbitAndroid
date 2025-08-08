package com.coderabbit.app.calculator

import org.junit.Assert.assertTrue


class CarTest {

    fun startEngine() {
        // Arrange
        val car = Car()
        // Act
        val result = car.startEngine()
        // Assert
        assertTrue(result)
    }
}