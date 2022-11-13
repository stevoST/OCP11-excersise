package programmer2.chapter14genericsandcollections.questions.question3;

import java.util.List;

public class Lists {
    public static void main(String[] args) {
        List<?> q = List.of("Mouse", "parrot");
        var v = List.of("Mouse", "parrot");
        List<Object> test = List.of("Mouse", "parrot");

//        q.removeIf(String::isEmpty);
//        q.removeIf(s -> s.length() == 4);
        v.removeIf(String::isEmpty);
        v.removeIf(s -> s.length() == 4);
//        test.removeIf(String::isEmpty);
//        test.removeIf(s -> s.length() == 4);
        System.out.println("test");
    }
}
