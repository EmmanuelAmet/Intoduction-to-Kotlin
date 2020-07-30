fun main(args: Array<String>) {
    /*
    How many Siblings do I have App
     */

    val siblings = 7
    var name: String ? = null
    println("Enter your name")
    name = readLine()
    do {
        var response: Int ? = null
        println("How many siblings do I have?")
        response = readLine()!!.toInt()
        if(response == siblings){
            println("Congratulation $name you win")
        }else{
            println("Opps! You lost,\nPlease try again")
        }
    }while (response != siblings)
}