package chap05.section6.dependency

class Patient(val name:String, var id: Int){
    fun doctor(d: Doctor){
        println("Patient: $name, Doctor: ${d.name}")
    }
}

class Doctor(val name: String, val p: Patient){
    val customerId: Int = p.id

    fun patientList() {
        println("Doctor: $name, Patient: ${p.name}")
        println("Patient ID: $customerId")
    }
}

fun main() {
    val patient1= Patient("song", 234)
    val doc1 = Doctor("Kim", patient1)
    doc1.patientList()
}