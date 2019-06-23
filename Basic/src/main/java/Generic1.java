import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * Created by tony on 2019-06-17.
 */
public class Generic1 {

    static class InnerClass<T> {

    }

    public static void main(String[] args) {

        InnerClass<Integer> innerClass = new InnerClass<Integer>(){

        }; // 匿名内部类的声明在编译时进行，实例化在运行时进行

        Type typeClass = innerClass.getClass().getGenericSuperclass();
        System.out.println(typeClass);

        if (typeClass instanceof ParameterizedType) {
            Type actualType = ((ParameterizedType)typeClass).getActualTypeArguments()[0];

            System.out.println(actualType);
        }
    }
}
