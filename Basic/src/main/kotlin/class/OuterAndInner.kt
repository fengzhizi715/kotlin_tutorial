package `class`

/**
 * Created by tony on 2018/8/9.
 */
class Outter2 {

    val str:String = "this property is from outter2 class"

    inner class Inner {

        fun foo() = println("$str")
    }
}

fun main(args: Array<String>) {

    val outter = Outter2()
    outter.Inner().foo()
}