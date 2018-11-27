
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

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

    launch(Dispatchers.Default) {
        repeat(6) {

            println("Receive ${channel.receive()}")
        }
    }
}