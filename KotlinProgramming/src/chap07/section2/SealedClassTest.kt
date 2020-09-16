////package chap07.section2
////
////
////
//////sealed 첫번째

sealed class Result {
    open class Success(val message: String) : Result()
    class Error(val code: Int, val message: String) : Result()
}

class Status: Result()
class Inside: Result.Success("Status")
//
//// sealed 두번째
//sealed class  Result
//open class Success(val message: String) : Result()
//class Error(val code: Int, val message: String) : Result()
//
//class Status: Result()
//class Inside: Success("Status")

fun main() {
    val result = Result.Success("Good!")
    val msg = eval(result)
    println(result)
}

fun eval(result: Result): String = when(result) {
    is Status -> "in progress"
    is Result.Success -> result.message
    is Result.Error -> result.message

}