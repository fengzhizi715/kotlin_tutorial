package generic

/**
 * Created by tony on 2019-06-23.
 */
abstract class Printer<in E> {

    abstract fun print(value: E): Unit
}

class AnimalPrinter: Printer<Animal>() {

    override fun print(animal: Animal) {
        println("this is animal")
    }
}

class DogPrinter : Printer<Dog>() {

    override fun print(dog: Dog) {
        println("this is dog")
    }
}

fun main() {

    val animalPrinter = AnimalPrinter()
    animalPrinter.print(Animal())

    val dogPrinter = DogPrinter()
    dogPrinter.print(Dog())
}