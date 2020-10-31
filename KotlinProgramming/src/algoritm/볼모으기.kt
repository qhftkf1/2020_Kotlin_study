package algoritm

import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.Integer.max
import java.lang.Math.min

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val N = br.readLine().toInt()
    val balls = br.readLine().toString()
    var frontCnt = 0
    var backCnt = 0
    var ballCnt = 0
    var rCnt = 0
    var bCnt = 0
    var elseCnt = 0

    for(i in 0 until N){
        if (balls[0] != balls[i])
            break
        frontCnt++
    }
    for(i in N - 1 downTo 0){
        if (balls[N - 1] != balls[i])
            break
        backCnt++
    }
    if ((balls[0] == 'B' && balls[N - 1] == 'B') || (balls[0] == 'R' && balls[N - 1] == 'R')) {
        for(i in 0 until N) {
            if(balls[0] == balls[i])
                ballCnt++
            else
                elseCnt++;
        }
        ballCnt -= max(frontCnt, backCnt)
        ballCnt = min(ballCnt, elseCnt)
    }else {
        for (i in 0 until N) {
            if (balls[i] == 'B')
                bCnt++
            else
                rCnt++;
        }
        if (balls[0] == 'B') {
            bCnt -= frontCnt
            rCnt -= backCnt
        }else{
            bCnt -= backCnt
            rCnt -= frontCnt
        }
        ballCnt = min(bCnt, rCnt)
    }
    println(ballCnt)
}