fun main(args: Array<String>) {
    var age: Int = 4
    when(age){
        1 -> println('A')
        2 -> println('B')
        3 -> println('C')
        4 -> println('D')
        else -> {
            println("Unknown")
        }
    }
    println("***********************")

    println("Enter a number between 1 - 10")
    var number = readLine()!!.toInt()
    when(number){
        1 -> println("Wrong Number")
        2 -> println("Getting Closer")
        3 -> println("Closer")
        4 -> println("Hmm ...")
        else -> println("Sorry you re way lost")
    }
}