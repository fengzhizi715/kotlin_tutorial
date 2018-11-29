/**
 * Created by tony on 2018/7/27.
 */
data class Person(var name:String,var password:String)

fun validate(person: Person):Boolean {

    /**
     * 验证单个字符串输入的方法
     */
    fun validateInput(input: String?) {

        if (input == null || input.isEmpty()) {
            throw IllegalArgumentException("must not be empty")
        }
    }

    validateInput(person.name)
    validateInput(person.password)
    return true
}

fun main(args: Array<String>) {

    val user1 = Person("tony","123456")
    println(validate(user1))

    val user2 = Person("tom","")
    println(validate(user2))
}