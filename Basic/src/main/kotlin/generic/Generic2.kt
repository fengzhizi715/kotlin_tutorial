package generic

import java.lang.reflect.ParameterizedType

/**
 * Created by tony on 2019-06-23.
 */
object Generic2 {

    @JvmStatic
    fun main(args: Array<String>) {

        val child = GenericChild()
        child.printType()
    }
}

open class Father<T>

class GenericChild : Father<String>() {

    fun printType() {

        val genType = javaClass.genericSuperclass
        println(genType)
        val params = (genType as ParameterizedType).actualTypeArguments[0]
        println(params)
    }
}