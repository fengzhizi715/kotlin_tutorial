import kotlinx.coroutines.*

/**
 * Created by tony on 2019-08-22.
 */

fun main() {

    GlobalScope.launch {

        val  result = async{

            delay(2000)
            1
        }

        result.invokeOnCompletion {

            if (it!=null){

                println("exception: ${it.message}")
            } else {

                println("result is complete")
            }
        }

        result.cancelAndJoin()

        println(result.await())
    }

    Thread.sleep(5000)
}