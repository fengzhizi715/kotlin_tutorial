import java.util.ArrayList;
import java.util.List;

/**
 * Created by tony on 2019-06-23.
 */
public class Generic4 {

    public static void main(String[] args) {

        List<? super Animal> animals = new ArrayList<>();
        animals.add(new Dog());
    }
}
