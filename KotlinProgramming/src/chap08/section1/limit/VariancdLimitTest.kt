package chap08.section1.limit

open class Animal(val size: Int){
    fun feed() = println("Feeding...")
}
class Cat(val jump: Int): Animal(50)
class Spider(val posion: Boolean): Animal(1)

class Box<out T: Animal>(val element: T){
    fun getAnimal(): T = element
    /*fun set(new: T){
        element = new
    }*/
}

fun main() {
    val c1: Cat = Cat(10)
    val s1: Spider = Spider(true)

    var a1: Animal = c1
    a1 = s1
    println("a1.size = ${a1.size}")

    val c2: Box<Animal> = Box<Cat>(Cat(10))
    //val c3: Box<Cat> = Box<Animal>(Cat(10))
    println("c2.element.size = ${c2.element.size}")
//    val c3: Box<Cat> = Box<Animal>(10) -> 오류
//    val c4: Box<Any> = Box<Int>(10)  -> 오류 자료형을 제한하여 Animal과 하위 클래스 이외에는 사용할 수 없음
}