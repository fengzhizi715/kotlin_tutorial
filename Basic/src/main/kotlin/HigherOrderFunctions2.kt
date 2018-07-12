/**
 * Created by tony on 2018/6/14.
 */
fun sum(a: Int, b: Int, term: (Int) -> Int): Int {

    var sum = 0
    for (i in a..b) {
        sum += term(i)
    }
    return sum
}

fun main(args: Array<String>) {

    val identity = { x: Int -> x }
    val square = { x: Int -> x * x }
    val cube = { x: Int -> x * x * x }
    println(sum(1, 10, identity)) //  55
    println(sum(1, 10, square))   //  385
    println(sum(1, 10, cube))     //  3025
}