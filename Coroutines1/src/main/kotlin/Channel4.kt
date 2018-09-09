import kotlinx.coroutines.experimental.CommonPool
import kotlinx.coroutines.experimental.channels.Channel
import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.runBlocking
import kotlin.coroutines.experimental.coroutineContext

/**
 * Created by tony on 2018/9/10.
 */
fun main(args: Array<String>) = runBlocking<Unit>{

    val channel = Channel<Int>(2) // 创建带有缓冲区的 channel

    launch(coroutineContext) {
        repeat(6) {
            println("Sending $it")
            channel.send(it)
        }
    }

    delay(1000)

    launch(CommonPool) {
        repeat(6) {

            println("Receive ${channel.receive()}")
        }
    }
}