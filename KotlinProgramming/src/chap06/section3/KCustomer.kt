package chap06.section3

class KCustomer{
    companion object{
        const val LEVEL = "INTERMEDIATE"
        @JvmStatic fun login() = println("login...") /// 컴패니언 객체를 사용하고자 할 떄
        @JvmField val JOB = Kjob() // 자바에서 프로퍼티를 사용하고자 할 떄
    }
}

class Kjob{
    var title: String = "Programmer"
}