package chap07.section1

interface Bird {
    val wings: Int
    fun fly()
    fun jump(){
        println("bird jump!")
    }
}

interface Horse {
    val maxSpeed: Int
    fun run()
    fun jump(){
        println("horse jump!, Max Speed : $maxSpeed")
    }
}

class Pegasus: Bird, Horse{
    override val maxSpeed: Int = 2
    override val wings: Int = 100

    override fun fly() {
        println("fly")
    }

    override fun run() {
        println("run")
    }

    override fun jump(){
        super<Horse>.jump()
        super<Bird>.jump()
        println("pegasus jump")
    }
}

fun main() {
    val pegasus= Pegasus()
    pegasus.fly()
    pegasus.run()
    pegasus.jump()
}