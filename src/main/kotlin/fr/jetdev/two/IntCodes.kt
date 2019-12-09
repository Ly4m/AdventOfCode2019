package fr.jetdev.two

import java.util.stream.Collectors

fun computeIntCode(baseIntCode: String): String {
    val intCode = baseIntCode.split(',').stream().map { Integer.parseInt(it) }.collect(Collectors.toList())

    set1202ProgramAlarm(intCode)

    val chunkSize = 4;
    (0 until (intCode.size - 1) step chunkSize)
        .takeWhile { computeChunkOperationAndContinue(it, intCode) }

    return intCode.joinToString(",")

}

fun set1202ProgramAlarm(baseIntCode: MutableList<Int>) {
    baseIntCode[1] = 12
    baseIntCode[2] = 2
}

fun computeChunkOperationAndContinue(chunkIndex: Int, intCode: MutableList<Int>): Boolean {
    if (intCode.size < chunkIndex + 3) return false

    val firstInputIndex = intCode[chunkIndex + 1]
    val secondInputIndex = intCode[chunkIndex + 2]
    val destIndex = intCode[chunkIndex + 3]

    when (intCode[chunkIndex]) {
        1 -> intCode[destIndex] = intCode[firstInputIndex] + intCode[secondInputIndex]
        2 -> intCode[destIndex] = intCode[firstInputIndex] * intCode[secondInputIndex]
        99 -> return false
    }
    return true
}
