/**
 * Created by tony on 2018/5/30.
 */
class Extension2 {

    fun test() = println("this is from test()")
}

fun Extension2.test() = println("this is from extension function")

fun main(args: Array<String>) {

    var extension2 = Extension2()

    extension2.test()
}