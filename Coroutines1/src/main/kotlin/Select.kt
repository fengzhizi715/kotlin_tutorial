import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.cancelChildren
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.selects.select
import kotlin.coroutines.CoroutineContext

/**
 * Created by tony on 2018/9/10.
 */
fun produce1(context: CoroutineContext) = GlobalScope.produce<String>(context) {

    while (true) {
        delay(400)
        send("Tony")
    }
}

fun produce2(context: CoroutineContext) = GlobalScope.produce<String>(context) {

    while (true) {
        delay(600)
        send("Monica")
    }
}

suspend fun selectProduces(channel1: ReceiveChannel<String>, channel2: ReceiveChannel<String>) {

    select<Unit> {

        channel1.onReceive {
            println("This is $it")
        }

        channel2.onReceive {
            println("This is $it")
        }
    }
}

fun main(args: Array<String>) = runBlocking {

    val tony = produce1(coroutineContext)
    val monica = produce2(coroutineContext)

    repeat(10) {
        selectProduces(tony, monica)
    }

    coroutineContext.cancelChildren() // 关闭子协程
}