/**
 * Created by tony on 2018/7/6.
 */
fun main(args: Array<String>) {

    val sum = {
        x: Int, y: Int -> x + y
    }

    println(sum(3, 5)) // 8
    println(sum(4, 6)) // 10
}