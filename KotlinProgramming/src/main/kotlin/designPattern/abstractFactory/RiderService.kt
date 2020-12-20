package designPattern.abstractFactory

class RiderService (val riderFactory: RiderFactory){
    fun work() : String {
        val rider = riderFactory.getRider()
        val helmet = riderFactory.getHelmet()
        val vehicle = riderFactory.getVehicle()
        return rider.delivery() + helmet.wear() + vehicle.move()
    }
}



fun main(){
    val riderService1 = RiderService(FullTimeRiderFactory)
    val riderService2 = RiderService(PartTimeRiderFactory)
    println(riderService1.work())
    println(riderService2.work())
}