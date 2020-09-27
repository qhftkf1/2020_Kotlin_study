package chap11.section2

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

 suspend fun doSomething(){
    println("doSomething")
}
fun main() {
    GlobalScope.launch {
        delay(1000L)
        doSomething()
        println("World")
    }
//    doSomething()
    println("Hello, ")
    Thread.sleep(2000L)
}