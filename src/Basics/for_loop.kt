package Basics

fun main(args: Array<String>) {
    // BASIC SYNTAX
    for(i in 1 .. 10 step 1) {
        println(i)
    }

    // USE OF STEP KEYWORD TO SKIP THE ITERATIONS
    for(i in 1 until 6 step 2) {
        println(i)
    }

    // TO ITERATE BACKWARDS
    for(i in 7 downTo 1 step 1) {
        println(i)
    }
}