/**
 * Created by tony on 2018/7/26.
 */
fun doForever(): Nothing {
    while(true) {
        println("do something...")
    }
}

fun main(args: Array<String>) {
    doForever()
    println("done")
}