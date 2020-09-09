package chap05.section2

class Bird_init(var name: String, var wing: Int, var beak: String, var color: String){

    init{
        println("----------초기화 블록 시작----------")
        println("my name is $name, my beak is $beak")
        this.sing(10)
        println("----------초기화 블록 끝------------")
    }
    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol : $vol")
}

fun main() {
    val coco = Bird_init("coco", 2, "middle", "Red")

    println("coco.color: ${coco.color}")

    coco.fly()
    coco.sing(3)
}