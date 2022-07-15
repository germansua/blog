package co.gersua.demo.calc

import kotlin.test.Test
import kotlin.test.assertEquals

class KotlinCalcTest {

    private val kotlinCalc = KotlinCalc()

    @Test
    fun addTwoIntegers() {
        assertEquals(3, kotlinCalc.add(1, 2))
        assertEquals(0, kotlinCalc.add(1, -1))
    }
}
