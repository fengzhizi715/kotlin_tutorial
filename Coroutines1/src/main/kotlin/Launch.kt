import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
/**
 * Created by tony on 2018/8/26.
 */

fun main(args: Array<String>) {

    val job = launch {
        delay(1000)
        println("Hello Coroutines!")
    }

    Thread.sleep(2000)
}