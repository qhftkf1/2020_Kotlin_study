package chap05.section3

// 1) 상속 가능한 클래스를 선언하기 위해 open 사용
open class Bird(var name: String, var wing: Int, var beak: String, var color: String){
    //메서드
    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}

// 2) 주 생성자를 사용하는 상속
class Lark(name: String, wing: Int, beak: String, color: String) : Bird(name, wing, beak, color){
    fun singHitone() = println("Happy Song!")
}

// 3) 부 생성자를 사용하는 상속
class Parrot : Bird {
    val language : String

    constructor(name: String,
                wing: Int,
                beak: String,
                color: String,
                language: String) : super(name, wing, beak, color){
        this.language = language
    }
    fun speak() = println("Speak! $language")
}

fun main() {
    val coco = Bird("mybird",2, "short", "blue")
    val lark = Lark("mylart", 2, "long", "brown")
    val parrot = Parrot("myparrot", 2, "short", "multiple", "korean")

    println("Coco: ${coco.name}, ${coco.wing}, ${coco.beak}, ${coco.color}")
    println("Lark: ${lark.name}, ${lark.wing}, ${lark.beak}, ${lark.color}")
    println("parrot: ${parrot.name}, ${parrot.wing}, ${parrot.beak}, ${parrot.color}, ${parrot.language}")

}
