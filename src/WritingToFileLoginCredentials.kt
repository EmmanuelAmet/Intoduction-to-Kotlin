import java.io.FileWriter

fun main() {
    println("Register User")
    println("Enter username")
    var username = readLine().toString()

    println("Enter First Name")
    var firstname = readLine().toString()

    println("Enter Last Name")
    var lastname = readLine().toString()

    println("Verify Details")
    println("Username: " + username + " Firstname: "+ firstname + " Lastname: " + lastname )

    if(firstname.equals("") || lastname.equals("") || username.equals("")){
        println("Please enter your Details")
    }else{
        WriteToFile( "Username: " + username + " Firstname: "+ firstname + " Lastname: " + lastname + "\n")
    }
}

fun WriteToFile(user: String){
    try {
        var writer = FileWriter("user.txt", true)
        writer.write(user)
        writer.close()
    }catch (ex: Exception){
        println("Exception: $ex")
    }

}