package classes

/**
 * Created by tony on 2018-12-03.
 */
class Constructor4(str:String) {

    init {

        println("$str"+1)
    }

    init {

        println("$str"+2)
    }

    constructor(str1: String, str2: String):this(str1) { // 调用主构造函数以及多个初始化块

        println("$str1 $str2")
    }

    init {

        println("$str"+3)
    }

    fun foo() = println("this is foo function")

}

fun main(args: Array<String>) {

    val obj = Constructor4("hello","world")
    obj.foo()
}