import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.ClosedReceiveChannelException

/**
 * Created by tony on 2018/9/9.
 */
fun main(args: Array<String>) = runBlocking {

    val channel = Channel<Int>()  //定义一个通道
    launch(Dispatchers.Default) {

        repeat(5) {

            i ->
            delay(200)
            channel.send((i+1) * (i+1))

            if (i==2) {

                channel.close()
            }
        }
    }

    launch(Dispatchers.Default) {
        repeat(5) {

            try {
                println(channel.receive())
            }catch (e: ClosedReceiveChannelException){
                println("There is a ClosedReceiveChannelException.")
            }
        }
    }

    delay(2000)

    println("Done!")
}