package fr.jetdev

import fr.jetdev.one.computeFuel
import fr.jetdev.two.computeIntCode
import java.io.File
import java.util.stream.Collectors

fun main(args: Array<String>) {
    printDayTwoAnswer();
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
}

