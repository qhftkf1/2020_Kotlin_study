package designPattern.abstractFactory

interface RiderFactory {
    fun getRider() : Rider
    fun getVehicle() : Vehicle
    fun getHelmet() : Helmet
}

object FullTimeRiderFactory : RiderFactory{
    override fun getRider() =  FullTimeRider()
    override fun getVehicle() = MotorCycle()
    override fun getHelmet() = MotorCycleHelmet()
}

object PartTimeRiderFactory : RiderFactory{
    override fun getRider() = PartTimeRider()
    override fun getVehicle() = Bike()
    override fun getHelmet(): Helmet = BikeHelmet()
}