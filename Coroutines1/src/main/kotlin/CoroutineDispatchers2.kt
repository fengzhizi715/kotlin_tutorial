import kotlinx.coroutines.experimental.*
import kotlin.coroutines.experimental.coroutineContext

/**
 * Created by tony on 2018/9/10.
 */
fun main(args: Array<String>) = runBlocking(CommonPool) {

    val jobs = ArrayList<Job>()

    jobs += launch(Unconfined) { // 无限制
        println("'Unconfined': I'm working in thread ${Thread.currentThread().name}")
        delay(500)
        println("'Unconfined': After delay in thread ${Thread.currentThread().name}")
    }

    jobs += launch(coroutineContext) { // 使用父级的上下文，也就是 runBlocking 的上下文
        println("'coroutineContext': I'm working in thread ${Thread.currentThread().name}")
    }

    jobs += launch(CommonPool) {
        println("'CommonPool': I'm working in thread ${Thread.currentThread().name}")
    }

    jobs += launch {
        println("'default': I'm working in thread ${Thread.currentThread().name}")
    }

    jobs += launch(newSingleThreadContext("MyThread")) { // 创建自己的新线程
        println("'MyThread': I'm working in thread ${Thread.currentThread().name}")
    }

    jobs.forEach { it.join() }
}