package chap05.section2


class Bird{
    var name: String
    var wing: Int
    var beak: String
    var color : String

    constructor(_name: String, _wing: Int, _beak: String, _color: String){
        name = _name
        wing = _wing
        beak = _beak
        color = _color
    }

    constructor(_name: String,_beak: String){
        name = _name
        wing = 3
        beak = _beak
        color = "red"
    }
    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol : $vol")
}

fun main() {
    val coco = Bird("coco", 2, "middle", "Red")
    val nono = Bird("nono", "long")
    println("coco.color: ${coco.color}")
    println("coco.color: ${nono.name}")
    coco.fly()
    coco.sing(3)
}