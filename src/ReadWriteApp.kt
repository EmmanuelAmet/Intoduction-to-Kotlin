import java.io.FileReader
import java.io.FileWriter

fun main() {
    menu()
}

fun menu(){
    println("Enter: ")
    println("1 - write ")
    println("2 - Read ")
    println("Exit \n")

    var chioce = readLine()!!.toInt()

    var message:String?
    when(chioce){
        1 -> {
            println("Enter message")
            message = readLine().toString()
            writeToFileApp(message)
        }
        2 -> {
            println("Reading ...")
            readFileApp()
        }
        3 -> {
            println("Exiting ...")
        }
    }
}

fun writeToFileApp(message: String){
    try {
        var writer = FileWriter("App.txt", true)
        writer.write(message)
        writer.close()
    }catch (ex: Exception){
        println("Excepton $ex")
    }

}

fun  readFileApp(){
    var reader = FileReader("App.txt")
    var char: Int?
    try {
        do {
            char = reader.read()
            print(char.toChar())
        }while (char != -1)
    }catch (ex: Exception){
        println(ex.message)
    }
}