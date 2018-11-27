
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.channels.consumeEach
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.runBlocking

/**
 * Created by tony on 2018/9/10.
 */

fun produce1() = GlobalScope.produce(Dispatchers.Default) {
    for (x in 1..5) {
        send(x)
    }
}

fun produce2(numbers: ReceiveChannel<Int>) = GlobalScope.produce(Dispatchers.Default) {
    for (x in numbers) {
        send((x * x))
    }
}

fun produce3(numbers: ReceiveChannel<Int>) = GlobalScope.produce(Dispatchers.Default) {
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
    adds.cancel()
}