/**
 * Created by tony on 2018/9/17.
 */
class User constructor(){

    lateinit var name:String
    lateinit var password: String

    constructor(name: String, password: String):this() {

        this.name = name
        this.password = password
    }

    override fun toString(): String {
        return "name:$name,password=$password"
    }
}