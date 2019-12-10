package fr.jetdev

import fr.jetdev.three.computeWires
import fr.jetdev.two.computeIntCode
import org.junit.Test
import kotlin.test.assertEquals

class ThreeTest {

    @Test
    fun shouldReturnIntersectCoord() {
        val wire1 = "R75,D30,R83,U83,L12,D49,R71,U7,L72"
        val wire2 = "U62,R66,U55,R34,D71,R55,D58,R83"
        assertEquals("159", computeWires(wire1, wire2))
    }

    @Test
    fun shouldReturnBestIntersectCoord() {
        val wire1 = "R98,U47,R26,D63,R33,U87,L62,D20,R33,U53,R51"
        val wire2 = "U98,R91,D20,R16,D67,R40,U7,R15,U6,R7"
        assertEquals("135", computeWires(wire1, wire2))
    }
}
