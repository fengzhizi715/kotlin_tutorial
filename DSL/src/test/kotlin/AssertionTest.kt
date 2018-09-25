
import org.junit.Test

/**
 * Created by tony on 2018/9/25.
 */
class AssertionTest {

    @Test
    fun unitTestingWorks(){

        val result = Assertion(10)

        result isEqualTo 10
        result isDifferentFrom 11
    }
}