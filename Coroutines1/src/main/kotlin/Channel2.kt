import kotlinx.coroutines.experimental.CommonPool
import kotlinx.coroutines.experimental.channels.Channel
import kotlinx.coroutines.experimental.channels.ClosedReceiveChannelException
import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.runBlocking

/**
 * Created by tony on 2018/9/9.
 */
fun main(args: Array<String>) = runBlocking {

    val channel = Channel<Int>()  //定义一个通道
    launch(CommonPool) {

        repeat(5) {

            i ->
            delay(200)
            channel.send((i+1) * (i+1))

            if (i==2) {

                channel.close()
            }
        }
    }

    launch(CommonPool) {
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