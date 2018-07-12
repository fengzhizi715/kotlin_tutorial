/**
 * Created by tony on 2018/7/10.
 */
fun main(args: Array<String>) {

    val runnable = Runnable{

        println("test")
    }

    Thread (runnable).start()
}