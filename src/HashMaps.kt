fun main(args: Array<String>) {
    var hashmap = HashMap<Any, Any>()
    hashmap.put(1, "Married")
    hashmap.put("Emmanuel", "Single")
    hashmap.put("Eric", "Married")
    hashmap.put("Mills", "Single")


    println(hashmap.get(1))
    for (k in hashmap.keys){
        println(hashmap.get(k))
    }
}