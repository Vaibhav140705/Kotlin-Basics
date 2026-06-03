package Functions

fun main(args: Array<String>) {
    var a=20
    var b=40
    var c=60

    println("The addition of 2 nmumbers is: ${add1(a,b)}")
    println("The addition of 3 nmumbers is: ${add2(a,b,c)}")

}

fun add1(a1:Int, a2:Int):Int {
    return a1+a2
}

fun add2(a1:Int, a2:Int, a3:Int):Int {
    return a1+a2+a3
}