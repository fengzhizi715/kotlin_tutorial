import kotlinx.coroutines.experimental.CommonPool
import kotlinx.coroutines.experimental.channels.ReceiveChannel
import kotlinx.coroutines.experimental.channels.produce
import kotlinx.coroutines.experimental.channels.consumeEach
import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.runBlocking

/**
 * Created by tony on 2018/9/10.
 */

fun produce1() = produce(CommonPool) {
    for (x in 1..5) {
        send(x)
    }
}

fun produce2(numbers: ReceiveChannel<Int>) = produce(CommonPool) {
    for (x in numbers) {
        send((x * x))
    }
}

fun produce3(numbers: ReceiveChannel<Int>) = produce(CommonPool) {
    for (x in numbers) {
        send(x+1)
    }
}

fun main(args: Array<String>) = runBlocking<Unit> {

    val numbers = produce1()
    val squares = produce2(numbers)
    val adds = produce3(squares)

    adds.consumeEach {
        println(it.toString())
    }

    println("Done!")

    numbers.cancel()
    squares.cancel()
}