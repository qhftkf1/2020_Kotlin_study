package designPattern.abstractFactory

interface Rider{
    fun delivery() : String
    fun repairVehicle() : String
}

class FullTimeRider : Rider{
    override fun delivery() = "오토바이 배달"
    override fun repairVehicle() = "오토바이 수리"
}

class PartTimeRider : Rider{
    override fun delivery() = "자전거 배달"
    override fun repairVehicle() = "자전거 수리"
}