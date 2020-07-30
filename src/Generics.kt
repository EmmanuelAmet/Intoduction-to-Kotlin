import javax.print.attribute.standard.JobOriginatingUserName

class Login<T>(name: T, password: T){
    init {
        println("Name: " + name + " password" + password)
    }
}

class Person(username: String, password: String){
    var username: String? = null
    var password: String? = null

    init {
        this.username = username
        this.password = password
        println("Person Class")
    }
}


fun main(args: Array<String>) {
    var login = Login<String>("Emmanuel", "Pass")
    var login2 = Login<Int>(23, 345)
    var login3 = Login<Boolean>(false, true)

    var person1 = Person("Emma", "kjhgfc")
    var person2 = Person("Emma", "kjhgfc")

    var user = Login<Person>(person1, person2)
}