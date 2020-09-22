package chap08.section1

open class Burger(val flavor: Int){
    fun review() = println("delicious")
}

class InAndOutBurger(val price: Int): Burger(20)

class InOutTest<T, out U>(t: T, u: U) {
    //val propT: T = t // 오류
    val propU: U = u // out이라서 가능
    //fun func1(u: U){} // 오류
    fun func2(t: T) { // in이라서 가능
        print(t)
    }
}
fun startTestFunc(v: InOutTest<in Unit, *>){
    println(v.propU)
}
fun main() {
    var b1: InAndOutBurger = InAndOutBurger(2000)
    var bugger1 : Burger = Burger(20)


}