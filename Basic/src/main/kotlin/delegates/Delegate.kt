package delegates

/**
 * Created by tony on 2018/8/7.
 */
interface Marks {

    fun printMarks()
}

class StdMarks : Marks {

    override fun printMarks() = println("printed marks")
}

class ExcelMarks : Marks {

    override fun printMarks() = println("printed marks and export to excel")
}

interface Totals {

    fun printTotals()
}

class StdTotals : Totals {

    override fun printTotals() = println("calculated and printed totals")
}

class ExcelTotals : Totals {

    override fun printTotals() = println("calculated and printed totals and export to excel")
}

class Student(studentId: Int, marks: Marks, totals: Totals)
    : Marks by marks, Totals by totals

fun main(args: Array<String>) {

    val student1 = Student(1, StdMarks(), StdTotals())
    student1.printMarks()
    student1.printTotals()

    println("---------------------------")

    val student2 = Student(2, ExcelMarks(), ExcelTotals())
    student2.printMarks()
    student2.printTotals()
}