package Functions

fun main(args: Array<String>) {
    var a=90
    var b=10
    var sum=add(a,b)
    println("Addition is: $sum")
}

fun add(a:Int, b:Int)=a+b  // WHEN THERE IS A SINGLE STATEMENT FUNCTION THEN IT CAN BE USED AS A STATEMENT