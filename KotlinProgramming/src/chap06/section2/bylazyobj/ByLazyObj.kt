package chap06.section2.bylazyobj

class Person(val name: String, val age: Int)

fun main() {
    var isPersonInstantiated: Boolean = false

    val person: Person by lazy {
        isPersonInstantiated = true
        Person("kim", 23)
    }
    val personDelegate = lazy { Person("Hong", 27) }

    println("person Init: $isPersonInstantiated")
    println("personDelegate Init: ${personDelegate.isInitialized()}")

    println("person.name: ${person.name}")
    println("personDelegate Init: ${personDelegate.value.name}")

    println("person Init; $isPersonInstantiated")
    println("personDelegat Init: ${personDelegate.isInitialized()}")

}