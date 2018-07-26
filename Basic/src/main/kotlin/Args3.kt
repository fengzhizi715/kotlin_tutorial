/**
 * Created by tony on 2018/7/26.
 */
fun <T> toList2(vararg items: T, str: String): List<String> {
    val result = ArrayList<String>()
    for (item in items)
        result.add(item.toString())

    result.add(str)
    return result
}

fun main(args: Array<String>) {

    val array = arrayOf("java", "kotlin", "scala", "grvoovy")

    val list = toList2(*array, str = "tony")
    println(list)
}