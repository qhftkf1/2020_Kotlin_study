package chap05.section3

open class Bird_or(var name: String, var wing: Int, var beak: String, var color: String){
    //메서드
    fun fly() = println("Fly wing: $wing")
    open fun sing(vol: Int) = println("Sing vol: $vol")
}
// 3) 부 생성자를 사용하는 상속
class Parrot_or (name: String,
                wing: Int = 2,
                beak: String,
                color: String,
                var language: String = "natural") : Bird_or(name, wing, beak, color) {
        fun speak() = println("Speak! $language")
        override fun sing(vol : Int) {
            println("I'm a parrot! The volume level is $vol")
            speak()
        }
}

fun main() {
    val parrot = Parrot_or(name = "myparrot",beak = "short", color = "multiple")
    parrot.language = "English"

    println("parrot: ${parrot.name}, ${parrot.wing}, ${parrot.beak}, ${parrot.color}, ${parrot.language}")
    parrot.sing(5)
}