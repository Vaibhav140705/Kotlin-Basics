package Basics

fun main(args:Array<String>) {
    var a=20
    var b=10

    var opr="addition"

    when(opr) {
        "add" -> println("Addition is: ${a+b}")
        "sub" -> println("Subtraction is: ${a-b}")
        "mul" -> println("Multiplication is: ${a*b}")
        "div" -> println("Division is: ${a/b}")
        "mod" -> println("Modulus is: ${a%b}")
        else -> println("Wrong input")
    }

    // MULTIPLE STATEMENTS
    when(opr) {
        "addition" -> {
            var c=a+b
            println("Addition is: $c")
        }
        else -> println("Enter the correct value")
    }

    // AS AN EXPRESSION AND ALSO 3 SPECIAL CHECK THINGS
    var num=13

    var c=when(num) {
        11 -> "Number is 11"
        in 13..16 -> "Number is between 13 and 16"
        !in 13..16 -> "Number is outside the range of 13 to 16"
        in 13 until 16 -> "Number is between 13 and 16 but not exactly 16"
        else -> "Wrong input"
    }
    println(c)
}