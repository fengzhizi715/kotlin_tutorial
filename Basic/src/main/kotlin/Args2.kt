/**
 * Created by tony on 2018/7/26.
 */
fun main(args: Array<String>) {
    val array = arrayOf("java","kotlin","scala","groovy")
    val list = toList(*array)
    println(list)
}