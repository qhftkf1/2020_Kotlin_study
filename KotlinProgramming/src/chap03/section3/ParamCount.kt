package chap03.section3

fun main() {
    // 매개변수 없는 람다식
    noParam({ "Hello World!"})
    noParam{ "Hello World!" }

    // 매개변수 1개 있는 람다식
    oneParam({a -> "Hello World! $a"})
    oneParam{a -> "Hello World! $a"}
    oneParam{ "Hello World! $it"}

    // 매개변수 2개 이상 있는 람다식
    moreParam{a , b -> "Hello World! $a $b"}
    moreParam{_, b -> "Hello World! $b"} // 첫번째 문자열을 사용하지 않고 생략 가능

    // 인자와 함께 람다식을 사용하는 겨우
    withArgs("Arg1", "Arg2", {a, b -> "hello world! $a $b"})
    withArgs("Arg1", "Arg2") {a, b -> "hello world! $a $b"} // 소괄호 바깥으로도 분리 가능


}

fun noParam(out: () -> String) = println(out())

fun oneParam(out: (String) -> String) {
    println(out("OneParam"))
}

fun moreParam(out: (String, String) -> String){
    println(out("OneParam", "TwoParam"))
}

fun withArgs(a: String, b: String, out: (String, String) -> String){
    println(out(a, b))
}