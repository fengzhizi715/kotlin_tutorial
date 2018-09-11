import kotlinx.coroutines.experimental.cancelChildren
import kotlinx.coroutines.experimental.channels.ReceiveChannel
import kotlinx.coroutines.experimental.channels.produce
import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.runBlocking
import kotlinx.coroutines.experimental.selects.select
import kotlin.coroutines.experimental.CoroutineContext
import kotlin.coroutines.experimental.coroutineContext

/**
 * Created by tony on 2018/9/10.
 */
fun produce1(context: CoroutineContext) = produce<String>(context) {

    while (true) {
        delay(300)
        send("Tony")
    }
}

fun produce2(context: CoroutineContext) = produce<String>(context) {

    while (true) {
        delay(500)
        send("Monica")
    }
}

suspend fun selectProduces(tony: ReceiveChannel<String>, monica: ReceiveChannel<String>) {

    select<Unit> {
        tony.onReceive { value ->  // this is the first select clause
            println("This is $value")
        }

        monica.onReceive { value ->  // this is the second select clause
            println("This is $value")
        }
    }
}

fun main(args: Array<String>) = runBlocking<Unit> {

    val tony = produce1(coroutineContext)
    val monica = produce2(coroutineContext)

    repeat(5) {
        selectProduces(tony, monica)
    }

    coroutineContext.cancelChildren() // cancel tony & monica coroutines
}