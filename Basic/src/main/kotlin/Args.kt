/**
 * Created by tony on 2018/7/26.
 */
fun <T> toList(vararg items: T): List<T> {
    val result = ArrayList<T>()
    for (item in items)
        result.add(item)
    return result
}

fun main(args: Array<String>) {

    val list = toList("java","kotlin","scala","grvoovy")
    println(list)
}