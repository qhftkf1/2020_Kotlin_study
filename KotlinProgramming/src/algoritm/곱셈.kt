package algoritm

private fun main() {
    var num1 = readLine()!!.toString()
    var num2 = readLine()!!.toString()
    var num_array = Array(3, {0})
    var idx = 2;
    for(num in num2){
        num_array.set(idx, (num - '0').toInt())
        idx--
    }
    for(va in num_array){
        println(num1.toInt() * va)
    }
    println(num1.toInt() * num2.toInt())
}
