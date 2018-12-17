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

fun printPerson(person:Person) {
    val name = person.name
    val password = person.password

    fun print() {
        println("name=$name,password=$password") // print() 函数直接访问了它外部函数 printPerson() 的局部变量。
    }

    print()
}

fun main(args: Array<String>) {
    val user1 = Person("tony","123456")
    println(validate(user1))
    printPerson(user1)

    val user2 = Person("tom","")
    println(validate(user2))
}