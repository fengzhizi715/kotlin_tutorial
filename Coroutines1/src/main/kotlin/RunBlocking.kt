import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * Created by tony on 2018/8/26.
 */

fun main(args: Array<String>) = runBlocking<Unit> {

    launch {
        delay(1000)
        println("Hello World!")
    }

    delay(2000)
}