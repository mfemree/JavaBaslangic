package Gun47;

import java.util.ArrayList;
import java.util.List;

public class S48 {
    public static void main(String[] args) {

        List colors = new ArrayList<>();
        colors.add("green");
        colors.add("blue");
        colors.add("red");
        colors.add("yellow");
        colors.remove(2);              // 2. indexteki red silindi
        colors.add(3,"cyan");   // en sona cyan eklendi
        System.out.println(colors);          // [green, blue, yellow, cyan]






    }
}