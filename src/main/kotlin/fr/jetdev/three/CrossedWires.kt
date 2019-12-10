package fr.jetdev.three

import java.util.stream.Collectors
import kotlin.math.absoluteValue

fun computeWires(wire1: String, wire2: String): String {

    val wire1Points = traceWire(wire1)
    val wire2Points = traceWire(wire2)

    val intersect = listOf<Pair<Int, Int>>().toMutableList();

    wire1Points.stream().forEach { w1: Pair<Int, Int> ->
        intersect.addAll(wire2Points.stream().filter { w1 == it }.collect(Collectors.toList()))
    }

    intersect.removeAt(0)

    val closestIntersection = intersect.stream()
        .mapToInt { (x, y) -> x.absoluteValue + y.absoluteValue }
        .min()

    return closestIntersection.orElse(-1).toString();


}

private fun traceWire(wire: String): MutableList<Pair<Int, Int>> {
    val wireCoord = listOf(Pair(0, 0)).toMutableList()

    wire.split(",").forEach {
        val direction = it[0]
        val distance = Integer.parseInt(it.substring(1));

        when (direction) {
            'R' -> {
                (0 until distance).forEach { _ ->
                    val (x, y) = wireCoord.last()
                    wireCoord.add(Pair(x + 1, y))
                }
            }
            'D' -> {
                (0 until distance).forEach { _ ->
                    val (x, y) = wireCoord.last()
                    wireCoord.add(Pair(x, y - 1))
                }

            }
            'L' -> {
                (0 until distance).forEach { _ ->
                    val (x, y) = wireCoord.last()
                    wireCoord.add(Pair(x - 1, y))
                }

            }
            'U' -> {
                (0 until distance).forEach { _ ->
                    val (x, y) = wireCoord.last()
                    wireCoord.add(Pair(x, y + 1))
                }
            }
        }
    }
    return wireCoord
}
