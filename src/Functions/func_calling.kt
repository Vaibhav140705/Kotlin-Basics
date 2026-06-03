package Functions

fun main(args: Array<String>) {
    var a=10
    var b=50
    var sum=::addn
    println("The addition is: ${sum(a,b)}")
}

fun addn(a1:Int, a2:Int):Int {
    return a1+a2
}