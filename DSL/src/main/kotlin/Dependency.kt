/**
 * Created by tony on 2018/9/24.
 */
class Dependency {

    fun compile(library: String) {
        println("added dependency on $library")
    }

    operator fun invoke(body: Dependency.() -> Unit) {
        body()
    }
}

fun main(args: Array<String>) {

    val dependencies = Dependency()

    dependencies{

        compile("com.safframework.log:saf-log:1.5.3")
        compile("com.safframework.log:saf-logginginterceptor:1.3.1")
    }
}