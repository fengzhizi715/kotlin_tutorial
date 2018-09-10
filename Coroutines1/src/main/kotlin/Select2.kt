import kotlinx.coroutines.experimental.cancelChildren
import kotlinx.coroutines.experimental.channels.ReceiveChannel
import kotlinx.coroutines.experimental.channels.produce
import kotlinx.coroutines.experimental.runBlocking
import kotlinx.coroutines.experimental.selects.select
import kotlin.coroutines.experimental.coroutineContext

/**
 * Created by tony on 2018/9/10.
 */
suspend fun selectProduces2(tony: ReceiveChannel<String>, monica: ReceiveChannel<String>): String = select<String> {

    tony.onReceiveOrNull { value ->
        if (value == null) "Channel 'tony' is closed"
        else "This is $value"
    }

    monica.onReceiveOrNull { value ->
        if (value == null) "Channel 'monica' is closed"
        else "This is $value"
    }
}

fun main(args: Array<String>) = runBlocking<Unit> {

    val tony = produce<String>(coroutineContext) {
        repeat(2) {
            send("Tony")
        }
    }
    val monica = produce<String>(coroutineContext) {
        repeat(2) {
            send("Monica")
        }
    }

    repeat(4) {
        println(selectProduces2(tony, monica))
    }

    coroutineContext.cancelChildren() // cancel tony & monica coroutines
}