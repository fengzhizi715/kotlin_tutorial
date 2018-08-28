import kotlinx.coroutines.experimental.CoroutineStart
import kotlinx.coroutines.experimental.async
import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch

/**
 * Created by tony on 2018/8/27.
 */

fun main(args: Array<String>) {

    launch {

        val result1 = async {

            delay(2000)
            1
        }

        val  result2 = async(start= CoroutineStart.LAZY) {

            delay(1000)
            2
        }

        val  result = result1.await() + result2.await()
        println(result)
    }

    Thread.sleep(5000)
}