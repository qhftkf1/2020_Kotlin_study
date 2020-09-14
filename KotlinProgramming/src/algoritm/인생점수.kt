package algoritm

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.properties.Delegates

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val N = br.readLine().toInt()
    repeat(N){
        var cnt = 0
        val s = br.readLine().toString()
        for(c in s){
            if(c == ' ')continue
            cnt += c -'A' + 1
        }
        when{
            cnt == 100 -> println("PERFECT LIFE")
            else -> println(cnt)
        }
    }
}