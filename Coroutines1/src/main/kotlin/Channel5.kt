import kotlinx.coroutines.experimental.CommonPool
import kotlinx.coroutines.experimental.channels.Channel
import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.runBlocking

/**
 * Created by tony on 2018/9/11.
 */
fun main(args: Array<String>) = runBlocking<Unit>{

    val channel = Channel<Int>(2) // 创建带有缓冲区的 channel

    launch(kotlin.coroutines.experimental.coroutineContext) {
        repeat(6) {
            delay(50)
            println("Sending $it")
            channel.send(it)
        }
    }

    launch(CommonPool) {

        delay(1000)
        repeat(6) {
            println("Receive ${channel.receive()}")
        }
    }

    delay(20000)
}