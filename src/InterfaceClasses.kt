
interface InputHandler{

    fun clicked()
    fun doubleClicked()
    fun singleClecked()
}

class Phone: InputHandler{
    override fun clicked() {
        println("Phones Factories")
            }

    override fun doubleClicked() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun singleClecked() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
class Button: InputHandler{
    override fun clicked() {
        println("Button Clicked")
    }

    override fun doubleClicked() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun singleClecked() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}

fun main(args: Array<String>) {
    var myButton = Button()
    myButton.clicked()
    var phone = Phone()
    phone.clicked()
}