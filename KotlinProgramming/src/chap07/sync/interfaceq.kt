package chap07.sync

interface A {
    fun functionA() {}
}

interface B {
    fun functionB() {}
}

class C(val a:A, val b:B) {
    fun functionC() {
        a.functionA()
        b.functionB()
    }
}

class Ac : A{
    override fun functionA() {
        println("override a")
    }
}
class Bc : B{
    override fun functionB() {
        println("override b")
    }
}

//위임자를 이용한 클래스C
class DelegatedC(a: A, b: B) : A by a, B by b {
    fun functionC() {
        functionA()
        functionB()
    }
}

fun main() {
    val a = Ac()
    val b = Bc()
    val c = DelegatedC(a, b)
    c.functionC()
}