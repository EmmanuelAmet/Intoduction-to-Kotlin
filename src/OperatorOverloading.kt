



fun main(args: Array<String>) {
    var a = 4
    var b = 5
    //println(a + b)
    //println(a.plus(b))

    val point1 = Point(10, -4)
    val point2 = Point(3, 5)
    var sum = point1 + point2
    //var sum = point1 + point2
    println("Sum is: (${sum.x}, ${sum.y})" )
}

class Point(var x: Int = 0, var y: Int = 12){
    operator fun  plus(p: Point): Point{
        return  Point(x + p.x, y + p.y)
    }
}