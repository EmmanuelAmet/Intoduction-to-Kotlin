
class person{

    companion object Name{
        val name = "Emmanuel"
        fun showName() = println("My Name is $name")
    }
}
fun main(args: Array<String>) {
    person.showName()
}