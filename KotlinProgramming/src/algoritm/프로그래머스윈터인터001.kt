package algoritm

import java.awt.Point
import java.util.*

class Solution {
    fun solution(n: Int, delivery: Array<IntArray>): String {
        var answer = ""
        var map = mutableMapIf(n);
        for(i in 0 until n){
            if(delivery[i][2] == 1)

        }
        return answer
    }

    fun main() {
        var sc: Scanner = Scanner(System.`in`)
        var n = sc.nextInt()
        var m = sc.nextInt()
        var k = sc.nextInt()
        var trashMap = creatMap(n, m)
        repeat(k){
            var y = sc.nextInt()
            var x = sc.nextInt()
            trashMap[y - 1][x - 1] = 1
        }

        lateinit var sampleQueue: Queue<Point>

        for(i in 0 until n){
            for(j in 0 until m){
                when{
                    trashMap[i][j] == 1 ->{
                        sampleQueue = LinkedList()
                        sampleQueue.add(Point(j, i))
                        for(k in 0 until 4){

                        }
                    }
                }
            }
        }

    }
}