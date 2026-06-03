package Basics

fun main(args:Array<String>) {
    var marks=90

    //HERE IF-ELSE_IF-ELSE CAN BE USED AS A STATEMENT IN THE CODE DUE TO WHICH CAN BE USED AS THE TERNARY OPERATOR...
    var grades=if(marks>80) "Excellent" else if(marks>60 && marks<80) "Good" else "Bad"

    println("Your grade is: $grades")
}