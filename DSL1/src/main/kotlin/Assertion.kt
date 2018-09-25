import org.junit.Assert

/**
 * Created by tony on 2018/9/25.
 */
class Assertion<T>(private val target: T) {

    infix fun isEqualTo(other: T) {
        Assert.assertEquals(other, target)
    }

    infix fun isDifferentFrom(other: T) {
        Assert.assertNotEquals(other, target)
    }
}