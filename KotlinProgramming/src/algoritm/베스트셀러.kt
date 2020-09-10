package algoritm

import java.io.BufferedReader
import java.io.InputStreamReader

class bookStore(N: Int) {
    var books = arrayOfNulls<String>(N)
    var i = 0;
    var max = 0;
    var bs: String =""
    fun store(book: String){
        books[this.i++] = book
    }

   fun check(){
       for(a in books){
           var cnt = 0
           for(b in books){
               if(a == b){
                cnt++
               }
           }
           if(max < cnt) {
               max = cnt
               if (a != null) {
                   this.bs = a
               }
           }else if(max == cnt){
               var i = 0
               var len = 0
               if(this.bs.length > a!!.length)
                   len = a.length
               else
                   len = this.bs.length
               while(i < len) {
                   if ((this.bs[i] - 'a').toInt() < (a!![i] - 'a').toInt())
                       break
                   else if((this.bs[i] - 'a').toInt() > (a!![i] - 'a').toInt()){
                       this.bs = a
                   }
                   else {
                       i++
                       if(this.bs.length > a!!.length)
                           this.bs = a
                       else
                           this.bs = this.bs
                   }
               }
           }
       }
       println(this.bs)
   }
}
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val N = br.readLine().toInt()
    var lib = bookStore(N)

    for(i in 1..N){
        val book = br.readLine().toString()
        lib.store(book)
    }
    lib.check()

}