
import kotlinx.coroutines.experimental.CommonPool
import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.withContext

/**
 * Created by tony on 2018/8/26.
 */

fun main(args: Array<String>) {

    launch {

        val result1 = withContext(CommonPool) {

            delay(2000)
            1
        }

        val  result2 = withContext(CommonPool) {

            delay(1000)
            2
        }

        val  result = result1 + result2
        println(result)
    }

    Thread.sleep(5000)
}