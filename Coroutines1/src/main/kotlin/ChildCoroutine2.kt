import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.runBlocking
import kotlin.coroutines.experimental.coroutineContext

/**
 * Created by tony on 2018/9/9.
 */
fun main(args: Array<String>) = runBlocking {

    val job = launch {

        val job1 = launch(coroutineContext)  {

            println("job1 is running")
            delay(1000)
            println("job1 is done")
        }

        val job2 = launch(coroutineContext) {

            println("job2 is running")
            delay(1500)
            println("job2 is done")
        }

        val job3 = launch(coroutineContext) {

            println("job3 is running")
            delay(2000)
            println("job3 is done")
        }

        job1.join()
        job2.join()
        job3.join()
    }

    job.join()

    println("all the jobs is complete")
}