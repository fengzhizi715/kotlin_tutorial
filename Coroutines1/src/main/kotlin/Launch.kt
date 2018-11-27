import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
/**
 * Created by tony on 2018/8/26.
 */

fun main(args: Array<String>) {

    val job = GlobalScope.launch {

        delay(1000)
        println("Hello Coroutines!")
    }

    Thread.sleep(2000)
}