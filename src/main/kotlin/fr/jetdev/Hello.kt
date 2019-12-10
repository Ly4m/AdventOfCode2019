package fr.jetdev

import fr.jetdev.one.computeFuel
import fr.jetdev.three.computeWires
import fr.jetdev.two.computeIntCode
import fr.jetdev.two.extrapolateNounAndVerbFromOutput
import java.io.File
import java.util.stream.Collectors

fun main(args: Array<String>) {
    printDayThreeAnswer();
}

private fun printDayOneAnswer() {
    val massOfAllModules = File("src\\main\\kotlin\\fr\\jetdev\\one\\modulesMass.in").readLines().stream()
        .map { Integer.parseInt(it) }
        .collect(Collectors.toList())
    println(computeFuel(massOfAllModules))
}

private fun printDayTwoAnswer() {
    val baseIntCode = File("src\\main\\kotlin\\fr\\jetdev\\two\\intCode.in").readText().trim()
    println(computeIntCode(baseIntCode))
    println("Extrapolation from output 19690720 " + extrapolateNounAndVerbFromOutput(baseIntCode, 19690720))
}

private fun printDayThreeAnswer() {
    val lines = File("src\\main\\kotlin\\fr\\jetdev\\three\\CrossedWires.in").readLines().stream()
        .collect(Collectors.toList())
    println("closest intersection is " + computeWires(lines[0], lines[1]))
}

