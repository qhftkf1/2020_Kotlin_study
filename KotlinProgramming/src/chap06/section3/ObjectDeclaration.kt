package chap06.section3

// 1) Object 키워드를 사용한 방식
object OCustomer{
    var name = "kildong"
    fun greeting() = println("Hello world!")
    val HOBBY = Hobby("Basketball")
    init {
        println("init!")
    }
}

// 2) 컴패니언 객체를 사용한 방식
class CCustomer{
    companion object{
        const val HELLO = "Hello"
        var name = "Joosol"
        @JvmField var HOBBY = Hobby("Football")
        @JvmStatic fun greeting() = println("Hello world!")
    }
}

class Hobby(val name: String)

fun main() {
    OCustomer.greeting()
    OCustomer.name = "Dooly"
    println("name = ${OCustomer.name}")
    println(OCustomer.HOBBY.name)

    CCustomer.greeting()
    println("name = ${CCustomer.name}, HELLO = ${CCustomer.HELLO}")
    println(CCustomer.HOBBY.name)
}