/**
 * Created by tony on 2018/7/13.
 */
fun doSomething1() {
    println("do something with inline")
}

fun doSomething2() {
    println("do something with noinline")
}

inline fun noinlineExample(something1: () -> Unit, noinline something2: () -> Unit) {

    something1.invoke()
    something2.invoke()
}

fun main(args: Array<String>) {

    noinlineExample(
            ::doSomething1,
            ::doSomething2
    )
}