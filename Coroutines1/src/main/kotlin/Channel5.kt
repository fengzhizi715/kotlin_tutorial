import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel

/**
 * Created by tony on 2018/9/11.
 */
fun main(args: Array<String>) = runBlocking<Unit>{

    val channel = Channel<Int>(2) // 创建带有缓冲区的 channel

    launch(kotlin.coroutines.coroutineContext) {
        repeat(6) {
            delay(50)
            println("Sending $it")
            channel.send(it)
        }
    }

    launch(Dispatchers.Default) {

        delay(1000)
        repeat(6) {
            println("Receive ${channel.receive()}")
        }
    }

    delay(20000)
}