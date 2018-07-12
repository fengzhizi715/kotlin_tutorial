
/**
 * Created by tony on 2018/7/10.
 */
public class User {

    private String name;

    public User(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
