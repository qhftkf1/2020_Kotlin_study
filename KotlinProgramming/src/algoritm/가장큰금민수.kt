package algoritm

import java.io.*

val num = arrayOf(4, 7)
var res = 0;

fun gold_min_su(a: Int, n: Int) {
    if(a > n) {
        return
    }else if(a <= n){
        if(a > res)
            res = a
    }
    for(i in num) {
        gold_min_su(a * 10 + i, n)
    }
}
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val N = br.readLine()
    gold_min_su(0, N.toInt());
    println(res)
    br.close()
}