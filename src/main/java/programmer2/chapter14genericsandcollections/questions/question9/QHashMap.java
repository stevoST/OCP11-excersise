package programmer2.chapter14genericsandcollections.questions.question9;

import java.util.HashMap;
import java.util.Map;

public class QHashMap {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();
        map.put("pi", 3.14159);
//        map.put("e", 2L);
        map.put("log(1)", new Double(0.0));
//        map.put('d', new Double(0.0));
    }
}
