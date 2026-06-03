package Basics

fun main(args: Array<String>) {
    var num=3

    for(i in 1 .. 10 step 1) {
        println("$num * $i = ${num*i}")
    }
}