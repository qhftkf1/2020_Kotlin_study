package algoritm

import java.util.*

fun main() {
    val sc: Scanner = Scanner(System.`in`)
    val N = sc.nextInt()
    var maxim = 1
    var rev : Int
    var flag : Int
    var num: Int
    var increase : Int = 1
    var decrease : Int = 1
    num = sc.nextInt()
    rev = num
    for(i in 1 until N){
        num = sc.nextInt()
        when{
            rev < num -> flag = 1
            rev > num -> flag = 2
            else -> flag = 3
        }
        when(flag){
            1 -> {
                increase++
                decrease = 1
            }
            2 -> {
                decrease++
                increase = 1
            }
            3 -> {
                increase++
                decrease++
            }
        }
        when{
            maxim < increase -> maxim = increase
            maxim < decrease -> maxim = decrease
        }
        rev = num
    }
    sc.close()
    println(maxim)
}