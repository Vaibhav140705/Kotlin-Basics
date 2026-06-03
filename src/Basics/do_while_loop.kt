package Basics

fun main(args: Array<String>) {
    var i=10
    do {              // ALWAYS EXECUTE AT LEAST ONCE EVEN IF THE WHILE CONDITION FALSE
        println(i)
        i++
    } while(i>11)
}