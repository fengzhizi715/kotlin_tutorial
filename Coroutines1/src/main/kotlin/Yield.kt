import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.yield

/**
 * Created by tony on 2018-11-30.
 */

fun main() = runBlocking {

    val job1 = launch {

        println(1)
        yield()
        println(3)
        yield()
        println(5)
    }

    val job2 = launch {

        println(2)
        yield()
        println(4)
        yield()
        println(6)
    }

    println(0)

    job1.join()
    job2.join()
}