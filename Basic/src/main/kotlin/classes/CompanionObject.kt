package classes

/**
 * Created by tony on 2018/8/21.
 */
class Student {

    companion object {

        private var username = "Tony"
        private var marks = "A"

        fun printMarks() = "The ${this.username}'s mark is ${this.marks}"

        fun changeMarks(marks:String){
            this.marks = marks
        }
    }
}

fun main(args: Array<String>) {

    Student.changeMarks("B")
    println(Student.printMarks())

    Student.changeMarks("C")
    println(Student.printMarks())
}