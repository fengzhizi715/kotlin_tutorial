import kotlinx.coroutines.experimental.*

/**
 * Created by tony on 2018/8/26.
 */

fun main(args: Array<String>) {

    val job = launch {
        delay(1000)
        println("Hello World!")
    }

    Thread.sleep(2000)
}