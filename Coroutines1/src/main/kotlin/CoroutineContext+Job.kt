import kotlinx.coroutines.experimental.*
import kotlin.coroutines.experimental.coroutineContext

/**
 * Created by tony on 2018/9/9.
 */
fun main(args: Array<String>) = runBlocking<Unit> {

    val job = Job() // 创建一个 job 对象来管理生命周期

    launch(coroutineContext+job)  {

        delay(500)
        println("job1 is done")
    }

    launch(coroutineContext+job) {

        delay(1000)
        println("job2 is done")
    }

    launch(coroutineContext+job) {

        delay(1500)
        println("job3 is done")
    }

    launch(coroutineContext+job) {

        delay(2000)
        println("job4 is done")
    }

    launch(coroutineContext+job) {

        delay(2500)
        println("job5 is done")
    }

    delay(1800)
    println("Cancelling the job!")
    job.cancelAndJoin() // 等待子协程完成后取消任务
}