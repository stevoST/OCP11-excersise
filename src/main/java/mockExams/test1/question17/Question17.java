package mockExams.test1.question17;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Question17 {
    public static void main(String[] args) {
        Object student1 = new Object();
        ConcurrentMap<String, Object> cache = new ConcurrentHashMap<>();
        cache.put("111", student1);
    }
}
