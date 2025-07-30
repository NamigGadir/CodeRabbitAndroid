package com.coderabbit.app.calculator

class Car {
    fun start(isElectric: Boolean): Boolean {
        return if (isElectric) {
            return true
        } else {
            throw Exception()
        }
    }
}