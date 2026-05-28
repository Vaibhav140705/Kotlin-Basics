package Basics

fun main(args:Array<String>) {
    var a = 15
    var b = 7

    // ARITHMETIC OPERATORS
    println("Addition(a+b): ${a+b}")
    println("Subtraction(a-b): ${a-b}")
    println("Multiplication(a*b): ${a*b}")
    println("Division(a/b): ${a/b}")
    println("DivisionInDecimal(a/b): ${a/b.toFloat()}")
    println("Modulus(a%b): ${a%b}")

    // ASSIGNMENT OPERATORS
    var c = 10
    c+=10
    println(c)
    c-=10
    println(c)
    c*=10
    println(c)
    c/=10
    println(c)
    c%=10
    println(c)

    // RELATIONAL OPERATORS
    var d=10
    var e=20
    println("Greater than: ${d>e}")
    println("Less Than: ${d<e}")
    println("Greater than or equal to: ${d>=e}")
    println("Less than or equal to: ${d<=e}")
    println("Equal to: ${d==e}")
    println("Not equal to: ${d!=e}")

}