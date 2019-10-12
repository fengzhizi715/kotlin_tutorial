import kotlinx.coroutines.*

/**
 * Created by tony on 2019-10-13.
 */

fun main() {

    val job =  GlobalScope.launch {

        withContext(NonCancellable) {

            delay(2000)
            println("this code can not be cancel")
        }
    }

    job.cancel()

    Thread.sleep(5000)
}