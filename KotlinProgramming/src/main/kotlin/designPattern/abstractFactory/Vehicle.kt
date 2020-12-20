package designPattern.abstractFactory

interface Vehicle{
    fun start() : String
    fun move() : String
}

class MotorCycle : Vehicle {
    override fun start() = "시동버튼"
    override fun move() = "악셀"
}

class Bike : Vehicle{
    override fun start() = "없다"
    override fun move() = "페달"
}