import kotlinx.coroutines.experimental.async
import kotlinx.coroutines.experimental.delay

/**
 * Created by tony on 2018/8/26.
 */

fun main(args: Array<String>) {

    val deferred  = async {

        delay(1000)
        println("Hello World!")
    }

    Thread.sleep(2000)
}