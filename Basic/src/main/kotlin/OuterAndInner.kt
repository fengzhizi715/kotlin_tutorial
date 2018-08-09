/**
 * Created by tony on 2018/8/9.
 */
class Outter2 {

    val temp:String = "this property is from outter2 class"

    inner class Inner {

        fun foo() = println("$temp")
    }
}

fun main(args: Array<String>) {

    val outter = Outter2()
    outter.Inner().foo()
}