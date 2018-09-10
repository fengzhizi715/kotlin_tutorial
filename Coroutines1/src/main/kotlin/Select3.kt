import kotlinx.coroutines.experimental.cancelChildren
import kotlinx.coroutines.experimental.channels.Channel
import kotlinx.coroutines.experimental.channels.consumeEach
import kotlinx.coroutines.experimental.channels.SendChannel
import kotlinx.coroutines.experimental.channels.produce
import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.runBlocking
import kotlinx.coroutines.experimental.selects.select
import kotlin.coroutines.experimental.CoroutineContext
import kotlin.coroutines.experimental.coroutineContext

/**
 * Created by tony on 2018/9/10.
 */
fun produce(context: CoroutineContext, anotherChannel: SendChannel<
        Int>) = produce<Int>(context) {

    for (num in 1..10) {

        delay(50)
        select<Unit> {
            onSend(num) {}                // 发送到当前 channel
            anotherChannel.onSend(num) {} // 或发送到另一个 channel
        }
    }
}

fun main(args: Array<String>) = runBlocking<Unit> {
    val another = Channel<Int>() // 分配另一个 channel

    launch(coroutineContext) {

        another.consumeEach {

            println("Another channel consuming $it")
            delay(100)
        }
    }

    produce(coroutineContext, another).consumeEach {

        println("Current channel consuming $it")
        delay(200)
    }

    println("Done!")
    coroutineContext.cancelChildren()
}