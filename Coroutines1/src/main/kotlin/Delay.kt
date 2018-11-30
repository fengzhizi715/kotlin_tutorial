import kotlinx.coroutines.*

/**
 * Created by tony on 2018-11-30.
 */

fun main(args: Array<String>) = runBlocking{

    println("1: current thread is ${Thread.currentThread().name}")

    GlobalScope.launch {

        println("3: current thread is ${Thread.currentThread().name}")

        delay(1000L)

        println("4: current thread is ${Thread.currentThread().name}")
    }

    println("2: current thread is ${Thread.currentThread().name}")

    Thread.sleep(2000L)

    println("5: current thread is ${Thread.currentThread().name}")
}