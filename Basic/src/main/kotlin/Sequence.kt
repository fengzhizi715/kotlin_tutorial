/**
 * Created by tony on 2018-12-02.
 */
fun main() {

    listOf(5, 12, 8, 33)
            .asSequence()
            .filter { it > 10 }
            .forEach(::println)

    println("-------------------")

    sequenceOf(5, 12, 8, 33)
            .filter { it>10 }
            .forEach (::println)
}