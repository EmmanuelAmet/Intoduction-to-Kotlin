fun main(args: Array<String>) {
    var myArray = Array<Int>(6){2}
    myArray[0] = 10
    myArray[1] = 34
    myArray[2] = 23
    myArray[3] = 24
    myArray[4] = 5
    myArray[5] = 56789
    for (element in myArray){
        println("Items " + element)
    }
    println(myArray[4])
    println("**************************")
    for (index in 0..myArray.size-1){
        println(myArray[index])
    }
}