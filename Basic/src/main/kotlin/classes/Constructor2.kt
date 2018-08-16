package classes

/**
 * Created by tony on 2018/8/16.
 */
class Constructor2 constructor() {

    init {

        println("test")
    }

    fun foo() = println("this is foo function")

}

fun main(args: Array<String>) {

    val obj = Constructor2()
    obj.foo()
}