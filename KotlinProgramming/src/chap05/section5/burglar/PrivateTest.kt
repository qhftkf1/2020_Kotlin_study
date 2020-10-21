package chap05.section5.burglar

private class PrivateClass{
    private var i = 1
    private fun privateFunc(){
        i += 1
    }
    fun access(){
        privateFunc()
    }
}

class OtherClass{
    private  val opc = PrivateClass()
    fun test(){
        val pc = PrivateClass()
    }
}
fun main(){
    val pc = PrivateClass()
    pc.access()

}