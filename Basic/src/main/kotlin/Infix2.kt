/**
 * Created by tony on 2018/6/4.
 */
class Infix2 {

    infix fun add(i: Int):Int {

        return 5 + i
    }

    fun printValue() {

        println(this add 10)
        println(add(10))
    }
}

fun main(args: Array<String>) {

    var infix2 = Infix2()

    infix2.printValue()
}