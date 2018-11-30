import kotlinx.coroutines.*

/**
 * Created by tony on 2018-11-30.
 */

fun main(args: Array<String>) = runBlocking{

    println("1: ${Thread.currentThread().name}")

    GlobalScope.launch {

        println("3: ${Thread.currentThread().name}")

        delay(1000L)

        println("4: ${Thread.currentThread().name}")
    }

    println("2: ${Thread.currentThread().name}")

    Thread.sleep(2000L)

    println("5: ${Thread.currentThread().name}")
}