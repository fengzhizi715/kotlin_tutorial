/**
 * Created by tony on 2018/5/30.
 */
class TestExtension2 {

    fun test() = println("this is from test()")
}

fun TestExtension2.test() = println("this is from extension function")

fun main(args: Array<String>) {

    var testExtension2 = TestExtension2()

    testExtension2.test()
}