/**
 * Created by tony on 2018/8/20.
 */
public enum Color {

    RED("红色", 1), GREEN("黄色", 2), BLUE("蓝色", 3);

    String colorName;
    int value;

    Color(String colorName, int value){
        this.colorName = colorName;
        this.value = value;
    }
}
