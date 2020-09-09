package algoritm

import java.util.*

fun main() {
    val sc: Scanner = Scanner(System.`in`)
    var a_cards = arrayOfNulls<Int>(10)
    var b_cards = arrayOfNulls<Int>(10)
    var cnt_A = 0
    var cnt_B = 0
    var cnt_D = 0
    for(i in 0..9)
        a_cards[i] =  sc.nextInt()
    for(i in 0..9)
        b_cards[i] =  sc.nextInt()
    val res = {x:Int?, y:Int? ->
        if(x!! > y!!) "a"
        else if(x!! < y!!) "b"
        else "d"}
    for(i in 0..9){
        var tmp = res(a_cards[i], b_cards[i])
        if( "a" == tmp)
            cnt_A++;
        else if( "b" == tmp)
            cnt_B++;
        else
            cnt_D++;
    }
    if(cnt_A > cnt_B)
        println('A')
    else if(cnt_A < cnt_B)
        println('B')
    else
        println('D')
}