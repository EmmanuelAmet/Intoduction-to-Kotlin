fun main(args: Array<String>) {
    println("Enter number one")
    var fisrt = readLine()!!.toInt()
    println("Enter number two")
    var second = readLine()!!.toInt()
    add(fisrt,second)
    subtruction(fisrt,second)
    multiplication(fisrt,second)
}

fun add(num1: Int, num2: Int){
    var sum = num1 + num2
    println("Addition Function: $num1 + $num2 = $sum")
}

fun subtruction(num1: Int, num2: Int){
    var sum = num1 - num2
    println("Subtruction Function: $num1 - $num2 = $sum")
}

fun multiplication(num1: Int, num2: Int){
    var sum = num1 * num2
    println("Multiplication Function: $num1 * $num2 = $sum")
}