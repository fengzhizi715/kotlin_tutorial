/**
 * Created by tony on 2018/9/17.
 */
class User{

    var name:String?=null
    var password: String?=null
    var addresses:Address?=null

    override fun toString(): String {
        return "name:$name,password=$password"
    }
}