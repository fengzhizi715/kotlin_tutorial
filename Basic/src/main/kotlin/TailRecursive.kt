/**
 * Created by tony on 2018/7/27.
 */
tailrec fun sumWithTailrec(n: Int, result: Int): Int = if (n <= 0) result else sumWithTailrec(n-1,result+n)

fun main(args: Array<String>) {
    println(sumWithTailrec(100000,0))
}