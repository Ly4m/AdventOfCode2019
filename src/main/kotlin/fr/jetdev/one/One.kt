import kotlin.math.floor

fun dayOne(input: List<Int>): Long =
        input.stream()
                .map { calculateFuelForMass(it) }
                .mapToLong { it }
                .sum()

fun calculateFuelForMass(mass: Int): Long = (floor(mass.div(3.0)) - 2).toLong()
