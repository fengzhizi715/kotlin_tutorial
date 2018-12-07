/**
 * Created by tony on 2018/9/24.
 */
class Dependency {

    fun compile(library: String) {
        println("$library")
    }

    operator fun invoke(action: Dependency.() -> Unit) {
        action()
    }
}

fun main(args: Array<String>) {

    val dependencies = Dependency()

    dependencies{

        compile("com.safframework.log:saf-log:1.5.4")  // 此处省略了this指代的是dependencies，完整的应该是 this.compile("com.safframework.log:saf-log:1.5.4")
        compile("com.safframework.log:saf-logginginterceptor:1.3.1")
    }
}