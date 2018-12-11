import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel

/**
 * Created by tony on 2018/9/9.
 */
fun main(args: Array<String>) = runBlocking {

    val channel = Channel<Int>()  //定义一个通道

    launch(Dispatchers.Default) {

        repeat(5) { // 重复5次发送消息，相当于 for(int i=0;i<5;i++)

            i ->
            delay(200)
            channel.send((i + 1) * (i + 1))
        }
    }

    launch(Dispatchers.Default) {

        repeat(5) {

            println(channel.receive())
        }
    }

    delay(2000)

    println("Receive Done!")
}