package chap05.section2

class Bird_two constructor(_name: String, _wing: Int, _beak: String, _color: String){

    var name: String = _name
    var wing: Int = _wing
    var beak: String = _beak
    var color: String = _color

    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol : $vol")
}

fun main() {
    val coco = Bird_two("coco", 2, "middle", "Red")

    println("coco.color: ${coco.color}")

    coco.fly()
    coco.sing(3)
}