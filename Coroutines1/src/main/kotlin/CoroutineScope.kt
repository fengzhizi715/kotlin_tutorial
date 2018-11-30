import kotlinx.coroutines.*

/**
 * Created by tony on 2018-11-30.
 */

fun main(args: Array<String>) {

    GlobalScope.launch {

        val result1 = withContext(Dispatchers.Default) {

            delay(2000)
            1
        }

        val  result2 = withContext(Dispatchers.IO) {

            delay(1000)
            2
        }

        val  result3 = coroutineScope {

            delay(1000)
            3
        }

        val  result = result1 + result2 + result3
        println(result)
    }

    Thread.sleep(5000)
}