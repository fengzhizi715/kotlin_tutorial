import kotlinx.coroutines.experimental.CommonPool
import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import kotlin.coroutines.experimental.coroutineContext

/**
 * Created by tony on 2018/9/9.
 */
fun main(args: Array<String>) {

    val job = launch {

        val childJob = launch(CommonPool+coroutineContext) {
            println("childJob: I am a child of the job coroutine, but with a different dispatcher")
            delay(1000)
            println("childJob: I will not execute this line if my parent job is cancelled")
        }

        childJob.join()
    }
    Thread.sleep(500)
    job.cancel() // 取消请求
    Thread.sleep(2000)
}