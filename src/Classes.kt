
class House(type: String, price: Double, year: Int, owner: String){
    var type: String? = null
    var year: Int? = null
    var price: Double? = null
    var  owner: String? = null

    init {
        this.type
        this.price
        this.owner
        this.year
        println("Type: $type")
    }

    fun GetType(): String?{
        return this.type
    }
    fun SetType(type: String){
        this.type = type
    }

}
fun main(args: Array<String>) {
    var myHouse = House("3 Bedroom", 2343.34, 1978, "Emmanuel")
    //myHouse.type = "6 Rooms"
    myHouse.SetType("8 Roomes")
    println(myHouse.GetType())
    //println(myHouse.type)
}

