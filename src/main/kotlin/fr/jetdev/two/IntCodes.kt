package fr.jetdev.two

import java.util.stream.Collectors

fun computeIntCode(input: String): String {
    val memory = resetMemory(input, 12, 2)

    (0 until (memory.size - 1) step 4)
        .takeWhile { computeChunkOperationAndContinue(it, memory) }

    return memory.joinToString(",")

}

fun extrapolateNounAndVerbFromOutput(input: String, output: Int): Pair<Int, Int> {
    for (noun in 0..99) {
        for (verb in 0..99) {
            val memory = resetMemory(input, noun, verb)
            (0 until (memory.size - 1) step 4)
                .takeWhile { computeChunkOperationAndContinue(it, memory) }
            if(memory[0] == output) {
                return Pair(noun, verb)
            }
        }
    }
    return Pair(0, 0) // todo (w.leemans) : gotta fix this ugly thing :D
}

fun resetMemory(input: String, noun: Int, verb: Int): MutableList<Int> {
    val memory = input.split(',').stream().map { Integer.parseInt(it) }.collect(Collectors.toList())
    memory[1] = noun
    memory[2] = verb
    return memory
}

fun computeChunkOperationAndContinue(instructionPointer: Int, memory: MutableList<Int>): Boolean {
    if (memory.size < instructionPointer + 3) return false

    val firstParameter = memory[instructionPointer + 1]
    val secondParameter = memory[instructionPointer + 2]
    val thirdParameter = memory[instructionPointer + 3]

    when (memory[instructionPointer]) {
        1 -> memory[thirdParameter] = memory[firstParameter] + memory[secondParameter]
        2 -> memory[thirdParameter] = memory[firstParameter] * memory[secondParameter]
        99 -> return false
    }
    return true
}

