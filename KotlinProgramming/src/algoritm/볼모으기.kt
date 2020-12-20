class Solution {
    fun solution(n: Int, delivery: Array<IntArray>): String {
        var answer = ""
        var check = arrayOfNulls<Int>(n + 1)

        for(i in 0 until delivery.size){
            if(delivery[i][2] == 1){
                check[delivery[i][0]] = 1
                check[delivery[i][1]] = 1
            }
        }
        for(i in 0 until delivery.size){
            if(delivery[i][2] == 0){
                if(check[delivery[i][0]] == 1)
                    check[delivery[i][1]] = 0
                else if(check[delivery[i][1]] == 1)
                    check[delivery[i][0]] = 0
            }
        }
        for(i in 0 until delivery.size){
            if(!(check[delivery[i][0]] == 0 || check[delivery[i][0]] == 1))
                check[delivery[i][0]] = 2
            if(!(check[delivery[i][1]] == 0 || check[delivery[i][1]] == 1))
                check[delivery[i][1]] = 2
        }
        for(i in 1 until n + 1){
            if(check[i] == 0)
                answer += 'X'
            else if(check[i] == 1)
                answer += 'O'
            else
                answer += '?'
        }
        return answer
    }
}