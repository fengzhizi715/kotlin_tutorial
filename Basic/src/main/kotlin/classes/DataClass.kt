package classes

/**
 * Created by tony on 2018/8/15.
 */
data class User(var name:String,var password:String)

fun main(args: Array<String>) {

    val user1 = User("tony","123456")

    val user2 = user1.copy()
    println(user2)

    println(user1===user2) // 判断 data class 的 copy 是否为深拷贝，如果二者内存地址指向不同则为深拷贝

    val user3 = user1.copy("monica")
    println(user3)

    val user4 = user1.copy(password = "abcdef")
    println(user4)
}