package chap03.section3

fun main() {
    println("functFunc: ${funcFunc()}")
}

fun sum(a: Int, b: Int) = a + b

fun funcFunc() : Int {
    return sum(2, 2)
}