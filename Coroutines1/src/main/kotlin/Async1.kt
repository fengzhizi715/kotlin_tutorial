import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.delay

/**
 * Created by tony on 2018/8/26.
 */

fun main(args: Array<String>) {

    val deferred  = GlobalScope.async {

        delay(1000)
        println("Hello Coroutines!")
    }

    Thread.sleep(2000)
}