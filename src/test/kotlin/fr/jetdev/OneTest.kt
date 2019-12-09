package fr.jetdev

import computeFuel
import org.junit.Test
import kotlin.test.assertEquals

class OneTest {

    @Test
    fun shouldNotAddFuelForFuel() {
        assertEquals(2, computeFuel(listOf(12)))
    }

    @Test
    fun shouldAddMoreFuel() {
        assertEquals(966, computeFuel(listOf(1969)))
    }

    @Test
    fun shouldAddEvenMoreFuel() {
        assertEquals(50346, computeFuel(listOf(100756)))
    }

}
