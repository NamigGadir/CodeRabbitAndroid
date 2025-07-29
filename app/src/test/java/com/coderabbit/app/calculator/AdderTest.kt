package com.coderabbit.app.calculator

import org.junit.Test


class AdderTest {

    @Test
    fun `test minus function`() {
        val adder = Adder()
        assert(adder.minus(5, 3) == 2)
    }
}