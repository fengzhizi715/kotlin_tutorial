/**
 * Created by tony on 2018/7/3.
 */
fun main(args: Array<String>) {
    val sum = {
        x: Int, y: Int -> x + y
    }

    println(sum(3, 5))
    println(sum(4,6))

    println(sum.invoke(4,6))
}