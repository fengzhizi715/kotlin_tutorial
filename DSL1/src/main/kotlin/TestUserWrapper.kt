/**
 * Created by tony on 2018/9/20.
 */
fun main(args: Array<String>) {

    val user =  user{

        name = "Tony"
        password = "1234567890"
        address {

            province = "Jiangsu"
            city = "Suzhou"
            street = "Renming Road"
        }
    }

    println(user.addresses)
}