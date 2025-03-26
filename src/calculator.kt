import java.util.Scanner
fun main() {
    var read=Scanner(System.`in`)
    println("first number")
    var num1 = read.nextInt()
    println("operator")
    var operator= readln()
    println("second number")
    var num2=read.nextInt()
    var results = when(operator){
        "+" -> num1+num2
        "-" -> num1+-num2
        "*" -> num1*num2
        "/" -> num1/num2
        else ->"invalid operator"
    }

    println("Answer = $results")


}