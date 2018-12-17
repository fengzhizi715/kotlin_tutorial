/**
 * Created by tony on 2018/5/31.
 */
class Extension3

val Extension3.text:String
    get() =  "this is a text property"


fun main(args: Array<String>) {
    var extension3 = Extension3()

    println(extension3.text)
}