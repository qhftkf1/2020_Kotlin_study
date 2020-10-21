package chap05.section5.burglar.internal

internal class InternalClass{
    internal var i = 1
    internal fun icFunc(){
        i += 1
    }
    fun access(){
        icFunc()
    }
}

class Others{
    internal  val opc = InternalClass()
    fun test(){
        val pc = InternalClass()
    }
}
fun main(){
    val mic = InternalClass()
    mic.i
    mic.icFunc()
}