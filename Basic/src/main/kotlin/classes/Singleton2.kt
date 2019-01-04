package classes

/**
 * 线程安全的懒汉模式
 * Created by tony on 2019-01-04.
 */
class Singleton2 private constructor() {

    companion object {
        val instance: Singleton2 by lazy { Singleton2() }
    }

    fun printlnHelloWorld() = println("hello world")
}

fun main(args: Array<String>) {

    val obj1 = Singleton2.instance
    val obj2 = Singleton2.instance
    println (obj1 === obj2)

    Singleton2.instance.printlnHelloWorld()
}