import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * Created by tony on 2019-06-23.
 */
public class Generic2 {

    public static void main(String[] args) {

        GenericChild child = new GenericChild();
        child.printType();
    }
}

class Father<T> {}

class GenericChild extends Father<String>{

    public void printType() {

        Type genType = getClass().getGenericSuperclass();
        System.out.println(genType);
        Type params = ((ParameterizedType) genType).getActualTypeArguments()[0];
        System.out.println(params);
    }
}
