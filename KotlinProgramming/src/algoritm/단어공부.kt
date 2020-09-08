package algoritm

private fun main() {
    var score = readLine()!!.toString()
    var alps = Array(26, {0})
    var flag : Int = 0
    var max = -1
    var cnt = 0
    for(c in score) {
        when (c) {
            in 'a'..'z' -> alps[(c - 'a').toInt()]++
            in 'A'..'Z' -> alps[(c - 'A').toInt()]++
        }
    }

    for(i in 0..25){
        if(alps[i] > max) {
            max = alps[i]
            flag = i
        }
    }
    for(num in alps){
        if(num == max)
            cnt++
    }
    if(cnt == 1)
        println((flag + 'A'.toInt()).toChar())
    else
        println("?")
}