package fr.jetdev

import fr.jetdev.two.computeIntCode
import org.junit.Test
import kotlin.test.assertEquals

class TwoTest {

    @Test
    fun shouldComputeOpCode1() {
        val base = "1,0,0,0,99"
        val expected = "2,0,0,0,99"
        assertEquals(expected, computeIntCode(base))
    }

    @Test
    fun shouldComputeOpCode2() {
        val base = "2,3,0,3,99"
        val expected = "2,3,0,6,99"
        assertEquals(expected, computeIntCode(base))
    }

    @Test
    fun shouldComputeOpCode99() {
        val base = "2,4,4,5,99,0"
        val expected = "2,4,4,5,99,9801"
        assertEquals(expected, computeIntCode(base))
    }

    @Test
    fun shouldComputeTheWholeIntCode() {
        val base = "1,1,1,4,99,5,6,0,99"
        val expected = "30,1,1,4,2,5,6,0,99"
        assertEquals(expected, computeIntCode(base))
    }

    @Test
    fun shouldComputeTheWholeIntCodeWithMultipleStep() {
        val base = "1,1,2,3,2,5,6,7,99"
        val expected = "1,1,2,3,2,5,6,30,99"
        assertEquals(expected, computeIntCode(base))
    }


}
