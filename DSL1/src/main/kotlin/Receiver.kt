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

    val sum3: Int.(Int) -> Int = {
        plus(it)
    }

    val s1 = sum1(3,5)
    val s2 = 3.sum2(5)
    val s3 = 3.sum3(5)

    println(s1)
    println(s2)
    println(s3)
}