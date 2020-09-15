package chap07.section2.inner

interface Switchar {
    fun on(): String
}
class SmartPhone(val model: String){
    private val cpu = "Exynos"

    inner class ExternalStorage(val size: Int){
        fun gerInfo() = "$model : Installed on $cpu with $size GB"
    }

    fun powerOn(): String{
        class Led(val color: String){
            fun blink(): String = "Blinking $color on $model"
        }
        val powerStatus = Led("Red")
        val powerSwitch = object : Switchar{
            override fun on() : String{
                return powerStatus.blink()
            }
        }
        return powerSwitch.on()
    }
}

fun main() {
    val mySdcard = SmartPhone("S7").ExternalStorage(32)
    val mytest = SmartPhone("test")
    
    println(mySdcard.gerInfo())

}