/**
 * Created by tony on 2018/7/27.
 */
fun sum(n: Int, result: Int): Int = if (n <= 0) result else sum(n-1,result+n)

fun main(args: Array<String>) {
    println(sum(100000,0))
}