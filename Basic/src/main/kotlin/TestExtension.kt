import java.util.regex.Pattern

/**
 * Created by tony on 2018/5/30.
 */
object TestExtension {


    @JvmStatic
    fun main(args: Array<String>) {

        println("fengzhizi715@126.com".checkEmail())

        var s:String = "123"
        s.trim()
    }

    fun String?.checkEmail(): Boolean {

        val emailPattern = "[a-zA-Z0-9][a-zA-Z0-9._-]{2,16}[a-zA-Z0-9]@[a-zA-Z0-9]+.[a-zA-Z0-9]+"
        return Pattern.matches(emailPattern, this)
    }
}