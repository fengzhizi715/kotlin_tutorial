
import kotlinx.coroutines.*
import kotlinx.coroutines.withContext

/**
 * Created by tony on 2018/8/26.
 */

fun main(args: Array<String>) {

    GlobalScope.launch {

        val result1 = withContext(Dispatchers.Default) {

            delay(2000)
            1
        }

        val  result2 = withContext(Dispatchers.Default) {

            delay(1000)
            2
        }

        val  result = result1 + result2
        println(result)
    }

    Thread.sleep(5000)
}