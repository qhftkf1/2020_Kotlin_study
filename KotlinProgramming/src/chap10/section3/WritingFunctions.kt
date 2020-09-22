package chap10.section3

import java.io.File
import java.io.PrintWriter

fun main() {
    val outString: String = "안녕하세요!"
    val intString: String = "넵 반갑습니다!"
    val path = "C:\\Users\\qhftk\\testFile.txt"
    val path2 = "C:\\Users\\qhftk\\testFile2.txt"
    val file = File(path)
    val printWriter = PrintWriter(file)

    printWriter.println(outString)
    printWriter.close()

    File(path2).printWriter().use { it.println((intString)) }
}