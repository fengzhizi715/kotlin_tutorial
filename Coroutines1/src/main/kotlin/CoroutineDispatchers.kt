import kotlinx.coroutines.experimental.*

/**
 * Created by tony on 2018/9/9.
 */
fun main(args: Array<String>) = runBlocking<Unit> {

    val jobs = ArrayList<Job>()

    jobs += launch(Unconfined) { // 无限制，在主线程运行
        println(" 'Unconfined': I'm working in thread ${Thread.currentThread().name}")
    }

    jobs += launch(coroutineContext) { // 父级上下文，runBlocking 的协程
        println("'coroutineContext': I'm working in thread ${Thread.currentThread().name}")
    }

    jobs += launch(CommonPool) {
        println(" 'CommonPool': I'm working in thread ${Thread.currentThread().name}")
    }

    jobs += launch {
        println(" 'default': I'm working in thread ${Thread.currentThread().name}")
    }

    jobs += launch(newSingleThreadContext("MyThread")) { // 创建自己的新线程
        println(" 'MyThread': I'm working in thread ${Thread.currentThread().name}")
    }

    jobs.forEach { it.join() }
}