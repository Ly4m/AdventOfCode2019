package fr.jetdev

import computeFuel
import java.io.File
import java.util.stream.Collectors

fun main(args: Array<String>) {

    val massOfAllModules = File("src\\main\\kotlin\\fr\\jetdev\\one\\modulesMass.in").readLines().stream()
            .map { Integer.parseInt (it) }
            .collect(Collectors.toList())
    println(computeFuel(massOfAllModules))
}

