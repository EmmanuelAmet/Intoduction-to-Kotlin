
class Outer(){
    var myString = "Outside the nested Class"

    inner class NestedClass{
        val newString = "Inside Nested Class"
        /*
        fun callInside(): String{
            return "Fuction cslled from inside"
        }
        */
        fun getStuff() = myString
        fun callInside() = "FUnction called from Inside"

    }
}


fun main(args: Array<String>) {
    /*
    println(Outer.NestedClass().newString)


    val nested = Outer.NestedClass()
    println(nested)
    */
    val outter = Outer()
    println("Using outer object:  ${outter.NestedClass().getStuff()}")
    val inner = Outer().NestedClass()
    println("Using inner Object: ${inner.getStuff()}" )
}