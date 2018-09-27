/**
 * Created by tony on 2018/9/17.
 */
fun main(args: Array<String>) {

    val sum1 = {
        x: Int, y: Int -> x + y
    }

    val sum2: Int.(Int) -> Int = {
        this + it
    }

    println(sum1(3,5))
    println(3.sum2(5))
}