fun main(args: Array<String>) {
    var num1 = 5
    var num2 = 6
    var num3 = 7

    if((num1 > num2) && (num3 < num1) ){
        println("No")
    }else{
        println("yes")
    }
    println("****************************")
    if((num1 > num2) || (num3 < num1) ){
        println("No")
    }else{
        println("yes")
    }
}