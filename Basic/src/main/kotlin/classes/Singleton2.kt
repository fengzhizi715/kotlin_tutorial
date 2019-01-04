package classes

/**
 * 线程安全的懒汉模式
 * Created by tony on 2019-01-04.
 */
class Singleton2 private constructor() {

    companion object {

        private var instance: Singleton2? = null
            get() {
                if (field == null) {
                    field = Singleton2()
                }
                return field
            }

        @Synchronized
        fun get() = instance!!
    }

    fun printlnHelloWorld() = println("hello world")
}

fun main(args: Array<String>) {

    val obj1 = Singleton2.get()
    val obj2 = Singleton2.get()
    println (obj1 === obj2)

    Singleton2.get().printlnHelloWorld()
}