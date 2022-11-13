package programmer2.chapter14genericsandcollections.questions.question20;

import java.util.HashMap;
import java.util.Map;

public class MapWithoutGenerics {
    public static void main(String[] args) {
        Map m = new HashMap<>();
        m.put(123,"456");
        m.put("abc","def");
//        System.out.println(m.contains("123"));
        System.out.println(m);
    }
}
