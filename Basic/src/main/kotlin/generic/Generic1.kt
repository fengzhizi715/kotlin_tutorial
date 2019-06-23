package generic

import java.lang.reflect.ParameterizedType

/**
 * Created by tony on 2019-06-17.
 */

object Generic1 {

    open class InnerClass<T>

    @JvmStatic
    fun main(args: Array<String>) {

        val innerClass = object : InnerClass<Int>() {

        } // 匿名内部类的声明在编译时进行，实例化在运行时进行

        val typeClass = innerClass.javaClass.genericSuperclass
        println(typeClass)

        if (typeClass is ParameterizedType) {

            val actualType = typeClass.actualTypeArguments[0]
            println(actualType)
        }
    }
}