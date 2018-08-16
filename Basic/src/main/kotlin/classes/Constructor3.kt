package classes

/**
 * Created by tony on 2018/8/10.
 */
class Constructor3(str:String) {

    init {

        println("$str")
    }

    constructor(str1: String, str2: String):this(str1) {

        println("$str1 $str2")
    }

    fun foo() = println("this is foo function")

}

fun main(args: Array<String>) {

    val obj1 = Constructor3("hello")
    obj1.foo()

    println("---------------------------")

    val obj2 = Constructor3("hello","world")
    obj2.foo()
}