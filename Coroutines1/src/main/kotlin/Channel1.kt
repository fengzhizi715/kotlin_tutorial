import kotlinx.coroutines.experimental.*
import kotlinx.coroutines.experimental.channels.Channel

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
        }
    }

    repeat(5) {

        println(channel.receive())
    }

    println("Done!")
}