package classes

/**
 * Created by tony on 2018/8/15.
 */
data class Address(var street:String)

data class User(var name:String,var password:String,var address: Address)

fun main(args: Array<String>) {

    val user1 = User("tony","123456", Address("renming"))

    val user2 = user1.copy()
    println(user2)

    println(user1.address===user2.address) // 判断 data class 的 copy 是否为浅拷贝，如果二者的address指向的内存地址相同则为浅拷贝，反之为深拷贝

    val user3 = user1.copy("monica")
    println(user3)

    val user4 = user1.copy(password = "abcdef")
    println(user4)
}