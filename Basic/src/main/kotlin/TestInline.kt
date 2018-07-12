import java.io.Closeable

/**
 * Created by tony on 2018/7/4.
 */
fun nonInlined(block: () -> Unit) {
    block()
}

inline fun inlined(block: () -> Unit) {
    block()
}

fun main(args: Array<String>) {

    nonInlined {
        println("do something with nonInlined")
    }

    inlined {
        println("do something with inlined")
    }
}