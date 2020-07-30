fun main(args: Array<String>) {
    var myArrayList = ArrayList<String>()
    myArrayList.add("Emmanuel")
    myArrayList.add("Henry")
    myArrayList.add("Emmanuel")
    myArrayList.add("Lydia")

    if(myArrayList.contains("Lydia")){
        println("Awesome")
        myArrayList.remove("Henry")
    }else{
        println("Oops!")
    }
    for (name in myArrayList){
        println(name)
    }

    for (index in 0..myArrayList.size-1){
        println(myArrayList.get(index))
    }
    println( myArrayList.get(0))
}