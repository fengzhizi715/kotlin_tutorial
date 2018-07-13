/**
 * Created by tony on 2018/7/13.
 */
val str: String by lazy{
    println("aaron")
    println("cafei")
    "tony"  // 最后一行为返回值
}

fun main(args: Array<String>) {
    println(str)
    println("-----------")
    println(str)
}