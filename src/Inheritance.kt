import kotlin.reflect.KProperty

open class Animal(){
    var name: String? = null
    var  color: String? = null
    var  numLegs: Int? = null
    constructor(name: String, color: String, numLegs: Int):this(){
        this.name = name
        this.color = color
        this.numLegs = numLegs

        println("Object: " + this.name)
        println("Object: " + this.color)
        println("Object: " + this.numLegs)
    }
    constructor(name: String, color: String): this(){
        this.name
        this.color
        println("Third Constructor: " + this.name)
    }

    fun setNumLegs(num: Int){
        this.numLegs = num
    }

    fun shownAnimal(){
        println("Name is " + this.name)
        println("Color is " + this.color)
        println("Number of Legs is " + this.numLegs)
    }
}

class Lion(): Animal(){

}


fun main(args: Array<String>) {
    //var animal = Animal("Dog", "Brown", 4)
    //var  lion = Lion()
    /*
    lion.name = "Leopard"
    lion.color = "Black"
    lion.numLegs = 5
    */

    //println(lion.name)
    //var animal = Animal("Goat", "Red")
    var animal = Animal()
    animal.name = "Cow"
    animal.color = "Brown"
    animal.setNumLegs(5)

    var animal2 = Animal("Vampire", "fair", 5)
    animal2.shownAnimal()
    animal.shownAnimal()

}