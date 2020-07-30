import java.io.FileReader
import java.io.FileWriter

fun main(args: Array<String>) {
    readFile()
    var message = "Hello Emmanuel Patrova Em, Kotlin is super awesome"
    writeToFile(message + "\n")
}

fun writeToFile(message: String){
    try {
        var writer = FileWriter("message.txt", true)
        writer.write(message)
        writer.close()
    }catch (ex: Exception){
        println("Excepton $ex")
    }

}

fun  readFile(){
    var reader = FileReader("message.txt")
    var readMessage:String? = null
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