/**
 * Created by tony on 2018/7/13.
 */
open class Base {

}

class Child: Base() {

}

fun Base.foo() = println("this is from base")

fun Child.foo() = println("this is from child")

fun executeFoo(base: Base) = base.foo()

fun main(args: Array<String>) {

    var base = Base()
    var child = Child()

    executeFoo(base)
    executeFoo(child)
}