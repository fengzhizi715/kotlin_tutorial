
import org.junit.Test

/**
 * Created by tony on 2018/9/25.
 */
class SimpleTest {

    @Test
    fun unitTestingWorks(){
        val result = Assertion(5)

        result isEqualTo 5
        result isDifferentFrom 6
    }
}