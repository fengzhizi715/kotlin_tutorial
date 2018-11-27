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
        delay(300)
        send("Tony")
    }
}

fun produce2(context: CoroutineContext) = GlobalScope.produce<String>(context) {

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