package classes

/**
 * Created by tony on 2018/8/10.
 */
class Constructor1 {

    init {

        println("test")
    }

    fun foo() = println("this is foo function")

}

fun main(args: Array<String>) {

    val obj = Constructor1()
    obj.foo()
}