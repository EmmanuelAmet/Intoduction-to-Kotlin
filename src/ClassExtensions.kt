
fun String.removeFirstandLastChar() : String = this.substring(1, this.length - 1)
fun Int.doubleNumber(): Int{
    return this + this
}


fun main(args: Array<String>) {
    var fullName = "Emmanuel Amet"
    val result = fullName.removeFirstandLastChar()

    println(result)
    var num = 12
    var res =num.doubleNumber()
    println(res)
}