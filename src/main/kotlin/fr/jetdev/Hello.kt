package fr.jetdev

import dayOne
import java.io.File
import java.util.stream.Collectors

fun main(args: Array<String>) {

    val massOfAllModules = File("src\\main\\kotlin\\fr\\jetdev\\one\\one.in").readLines().stream()
            .map { Integer.parseInt (it) }
            .collect(Collectors.toList())
    println(dayOne(massOfAllModules))


}

