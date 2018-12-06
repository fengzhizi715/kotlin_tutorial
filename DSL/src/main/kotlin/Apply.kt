/**
 * Created by tony on 2018/9/17.
 */
fun main(args: Array<String>) {

    val user = User().apply {

        name = "Tony"  // 此处省略了this，完整的应该是this.name= "Tony"
        password = "123456"
    }

    println(user)
}