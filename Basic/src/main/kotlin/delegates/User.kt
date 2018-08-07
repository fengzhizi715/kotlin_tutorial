package delegates

/**
 * Created by tony on 2018/8/7.
 */
class User(val id: Int) {

    var name: String by DatabaseDelegate("name", id)
    var password: String by DatabaseDelegate("password", id)
}