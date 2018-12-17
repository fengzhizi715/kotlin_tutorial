package classes

/**
 * Created by tony on 2018/8/9.
 */
class Outter1 {

    val str:String = "this property is from outter1 class"

    class Nested {

        fun foo() = println("")
    }
}

fun main(args: Array<String>) {
    Outter1.Nested().foo()
}