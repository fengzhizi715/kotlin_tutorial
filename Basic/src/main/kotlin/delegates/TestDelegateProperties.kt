package delegates

/**
 * Created by tony on 2018/8/7.
 */
fun main(args: Array<String>) {

    val tony = User(1)

    println("tony.password="+tony.password)

    println("---------------------------")

    tony.password = "P@ssword"

    println("---------------------------")

    println("tony.password="+tony.password)
}