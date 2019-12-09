import kotlin.math.floor

fun computeFuel(input: List<Int>): Int = input
        .stream()
        .map { calculateFuelForModule(it) }
        .mapToInt { it }
        .sum()

fun calculateFuelForMass(mass: Int): Int = (floor(mass.div(3.0)) - 2).toInt()

fun calculateFuelForModule(remainingMass: Int, currentFuel: Int = 0): Int {

    val fuel = calculateFuelForMass(remainingMass)

    return when {
        fuel <= 0 -> currentFuel
        else -> calculateFuelForModule(fuel, fuel + currentFuel)
    }

}
