/**
 * Created by tony on 2018/5/31.
 */
class TestExtension4 {

}

val TestExtension4.text:String
    get() =  "this is a text property"


fun main(args: Array<String>) {

    var testExtension4 = TestExtension4()

    println(testExtension4.text)
}