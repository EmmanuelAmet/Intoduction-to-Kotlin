
enum class Suits{
    HEARTS,
    SPADES,
    DIAMONDS,
    CLUBS
}

enum class Direction{
    NORTH,
    SOUTH,
    WEST,
    EAST
}
fun main(args: Array<String>) {
    var cardPlayer = Suits.HEARTS
    if(cardPlayer == Suits.DIAMONDS){
        println("Awesome")
    }else{
        println("Oops!")
    }

    var position = Direction.EAST
    println(position)
}