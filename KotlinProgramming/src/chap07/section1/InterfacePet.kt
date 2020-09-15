package chap07.section1

interface Pet {
    var category: String //키워드가 없어도 기본은 추상 프로퍼티
    val msgTags: String
        get() = "I'm your lovely pet!"
    var species: String

    fun feeding( ) // 기본은 추상 메서드
    fun patting( ) { // 구현부를 포함하면 일반적인 메서드
        println("Keep patting!") // 구현부
    }
}

class Cat(name: String, override var category: String) : Animal(name), Pet {
    override var species: String = "cat"
    override fun feeding() {
        println("Feed the dog a tuna can!")
    }
}

/*
fun main() {
    val obj = Cat("small")
    println("Pet categoory: ${obj.category}")
    println("Pet msgTags: ${obj.msgTags}")
    obj.feeding()
    obj.patting()
}*/
