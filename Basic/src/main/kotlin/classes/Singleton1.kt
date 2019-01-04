package classes

/**
 * 饿汉模式
 * Created by tony on 2018/8/21.
 */
object Singleton1 {

    fun printlnHelloWorld() = println("hello world")
}

fun main(args: Array<String>) {
    Singleton1.printlnHelloWorld()
}