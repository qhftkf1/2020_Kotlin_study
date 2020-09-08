package chap02.section3

fun main() {
    checkArg("Hello")
    checkArg(125)
}
fun checkArg(x : Any){
    if (x is String) {
        println("x is String")
    }else if (x is Int){
        println("x is Int")
    }
}