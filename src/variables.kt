fun main(args:Array<String>) {
    var a=92
    var b=90.2
    var c="Vaibhav Dikshit"

    println(a)
    a=2
    println(a)

    // a="Vaibhav Dikshit" --> Will throw an error because the type doesnt match of the updated value and the variable. As the type inferencing is done by its own of the variables.

    // Another way of declaring variables.
    val d=45  // Difference is that the variables declared with val keyword cannot be updated later. Here also type inferencing is done automatically.
    println(d)

    // Explicit variable data type defining.
    val e:Double=3.14  // The double used here is a datatype which is basically redundant because it automatically detects the data type but still we can give the data type as sometimes it is required.
    println(e)
}