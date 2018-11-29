
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/**
 * Created by tony on 2018/9/9.
 */
fun main(args: Array<String>) {

    val job = GlobalScope.launch {

        val childJob = GlobalScope.launch(Dispatchers.Default + coroutineContext) {
            println("childJob: I am a child of the job coroutine, but with a different dispatcher")
            delay(1000)
            println("childJob: I will not execute this line if job is cancelled")
        }

        childJob.join()
    }
    Thread.sleep(500)
    job.cancel() // 取消请求
    Thread.sleep(2000)
}