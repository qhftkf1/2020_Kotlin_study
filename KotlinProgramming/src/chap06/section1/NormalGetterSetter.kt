package chap06.section1

class User(_id: Int, _name: String, _age: Int){
    //프로퍼티
    val id: Int = _id
        get() = field

    var name: String = _name
        get() = field
        set(value) {
            field = value
        }

    var age: Int = _age
        get() = field
        set(value) {
            field = value
        }
}

fun main() {
    val user1 = User(1, "song", 29)
    user1.age = 35
    println("user.age : ${user1.age}")
}