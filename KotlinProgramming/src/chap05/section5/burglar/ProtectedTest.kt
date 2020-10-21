package chap05.section5.burglar

open class Base{
    protected var i = 1
    protected  fun protectedFunc(){
        i += 1
    }
    fun access(){
        protectedFunc()
    }
    protected class Nested // 내부 클래스에는 지시자 허용
}

class Derived : Base(){
    fun test(base: Base): Int {
        protectedFunc() // Base 클래스의 메서드 접근 가능
        return i // Base 클래스의 프로퍼티 접근 가능
    }
    fun test2(base: Base): Int{
        i += 2
        return i
    }
}

fun main(){
    val base = Base() // 생성 가능
    // base.i // 접근 불가
    // base.protectedFunc() // 접근 불가
    // base.access() // 접근 가능
    val der = Derived()
    println(der.test(base)) //  i = 2
    println(der.test2(base)) // i = 4

}