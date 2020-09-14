package algoritm

import java.util.*

lateinit var arr : Array<IntArray>
var a = mutableListOf<Int>()


fun sum_value(arr: Array<Array<Int>>, x: Int, sum: Int): Boolean{
    var total = 0
    for(i in x until 4){
        total += arr[x].getMin()
    }
    if(sum + total > 0)
        return false
    return true
}
fun backtracking(arr: Array<Array<Int>>, x: Int, sum: Int, st: Stack<Int>): Boolean{
    if(x == 4) {
        when {
            sum == 0 -> return true
            else -> return false
        }
    } else if(!(sum_value(arr, x, sum)))
        return false
    for(i in 0 until cnt[x]){
        st.add(arr[x][i])
        if(backtracking(arr, x + 1, arr[x][i] + sum, st))
            return true
        st.pop()
    }
    return false
}
fun main() = with(Scanner(System.`in`)) {
    a = mutableListOf(4) { nextInt() }
    val siz = a.max()!!
    arr = Array(4, { IntArray(siz)})
    var st = Stack<Int>()


    for(i in 0 until 4){
        var k = 0
        for(j in 0 until cnt[i]) {
            arr[i][k] = nextInt()
            k++
        }
    }
    backtracking(arr, 0, 0, st)
    st.forEach{print("$it ")}
}
fun Array<Int>.getMin(): Int{
    var min = 10001
    for(n in this) {
        if (n < min)
            min = n
    }
    return min
}

