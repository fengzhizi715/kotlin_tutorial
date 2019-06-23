import java.util.ArrayList;
import java.util.List;

/**
 * Created by tony on 2019-06-23.
 */
public class Generic3 {

    public static void main(String[] args) {

        List<? extends Animal> animals = new ArrayList<>();
        List<Dog> dogs = new ArrayList<>();
        animals = dogs;
    }
}
