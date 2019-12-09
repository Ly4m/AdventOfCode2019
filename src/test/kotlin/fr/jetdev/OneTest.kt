package fr.jetdev

import dayOne
import org.junit.Test
import kotlin.test.assertEquals

class OneTest {


    @Test
    fun shouldReturn2for12() {
        assertEquals(2, dayOne(listOf(12)));

    }

    @Test
    fun shouldReturn2for14() {
        assertEquals(2, dayOne(listOf(12)));

    }

    @Test
    fun shouldReturn654for1969() {
        assertEquals(654, dayOne(listOf(1969)));

    }

    @Test
    fun shouldReturn33583for100756(){
        assertEquals(33583, dayOne(listOf(100756)))
    }

}
