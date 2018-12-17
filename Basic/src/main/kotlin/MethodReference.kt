
import java.util.*

/**
 * Created by tony on 2018/7/10.
 */
fun main(args: Array<String>) {
    val u1 = User("tony")
    val u2 = User("cafei")
    val u3 = User("aaron")

    val users = Arrays.asList(u1, u2, u3)

    Collections.sort(users, Comparator.comparing(User::getName))
}