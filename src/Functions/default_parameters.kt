fun main(args: Array<String>) {
    var a = 20
    var b = 40
    var sum = addition(a)  // NO NEED TO ASSIGN THE 2nd ARGUMENT AS IT IS ALREADY DEFINED IN THE FUNCTION DEFINITION ITSELF
    println(sum)
}

fun addition(a1:Int, a2:Int=60):Int {   // 2nd PARAMETER VALUE IS DEFINED ALREADY
    return a1+a2
}