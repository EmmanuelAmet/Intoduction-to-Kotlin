fun main(args: Array<String>) {
    /*
    Array List
     */
    var myArrayList = listOf<String>("Emmanuel", "Henry", "Eric")
    var myArrayList2 = listOf(1,2,3, "Emmanuel", "Henry", "Eric")

    for(items in myArrayList2){
        println(items)
    }
    println(myArrayList)

    println("*****************")
    var mutable = mutableListOf<String>("AS", "AD", "C++", "C#")
    mutable[0] = "Kotlin"
    println(mutable)

    /*
    Hashmap
     */
    var hashmap = hashMapOf(1 to "Paulo", 2 to "C#")
    println(hashmap[1])

    /*
    Array
     */
    var myArray = arrayOf(2,3,4,5,5,5)
    for(item in myArray){
        println(item)
    }
}