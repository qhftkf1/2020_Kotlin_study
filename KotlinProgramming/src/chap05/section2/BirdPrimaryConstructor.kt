package chap05.section2

class Bird_two(var name: String, var wing: Int, var beak: String, var color: String){

    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol : $vol")
}

fun main() {
    val coco = Bird_two("coco", 2, "middle", "Red")

    println("coco.color: ${coco.color}")

    coco.fly()
    coco.sing(3)
}