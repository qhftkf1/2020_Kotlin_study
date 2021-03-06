package chap06.section2

class LazyTest {
    init{
        println("init block")
    }

    val subject by lazy {
        println("lazy initialized")
        "kotlin Programming"
    }
    fun flow(){
        println("not initialized")
        println("subject one : $subject")
        println("subject two : $subject")
    }
}

fun main() {
    val test = LazyTest()
    test.flow()
}