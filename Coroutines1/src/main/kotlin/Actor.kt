import kotlinx.coroutines.channels.actor
import kotlinx.coroutines.runBlocking
import kotlin.coroutines.coroutineContext

/**
 * Created by tony on 2018/9/10.
 */
fun main(args: Array<String>) = runBlocking<Unit> {

    val summer = actor<Int>(coroutineContext) {
        var sum = 0

        for (i in channel) { // 不断接收channel中的数据，这个channel是ActorScope的变量
            sum += i
            println("Sum = $sum")
        }
    }

    for (x in 1..10) {
        summer.send(x)
    }

    summer.close()
}