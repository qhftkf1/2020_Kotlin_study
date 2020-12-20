package designPattern.abstractFactory

interface Helmet{
    fun wear() : String
}

class MotorCycleHelmet : Helmet {
    override fun wear() = "오토바이 헬멧 착용"
}
class BikeHelmet : Helmet{
    override fun wear(): String = "자전거 헬멧 착용"
}
