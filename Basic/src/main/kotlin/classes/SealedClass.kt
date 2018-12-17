package classes

/**
 * Created by tony on 2018/8/20.
 */
sealed class Mammal(val name: String)

class Dog(dogName: String) : Mammal(dogName)
class Horse(horseName:String) :Mammal(horseName)
class Human(humanName: String, val job: String) : Mammal(humanName)

fun greetMammal(mammal: Mammal) = when (mammal) {
    is Dog -> "Hello ${mammal.name}"
    is Horse -> "Hello ${mammal.name}"
    is Human -> "Hello ${mammal.name}, You're working as a ${mammal.job}"
}

fun main(args: Array<String>) {
    println(greetMammal(Dog("wangwang")))
    println(greetMammal(Horse("chitu")))
    println(greetMammal(Human("tony", "coder")))
}