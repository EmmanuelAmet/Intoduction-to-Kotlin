
abstract class GraphicObject{
    fun moveTo(newX: Int, newY: Int){
        println("Move to x and y")
    }
    abstract fun draw()
    abstract fun resize()
}
class Circle: GraphicObject(){
    override fun draw() {
        println("Draw Circle")
    }

    override fun resize() {
        println("Resize Circle")    }

}

class Triangle: GraphicObject(){
    override fun draw() {
        println("Draw Trianle")    }

    override fun resize() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}

fun main(args: Array<String>) {
    var circle = Circle()
    circle.draw()
    circle.moveTo(3,5)

    var triangle = Triangle()
    triangle.draw()
}