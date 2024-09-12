package mockExams.test7.question15v1123338;

import java.util.List;
import java.util.function.Consumer;

public class Question15 {
    public static void main(String[] args) {
//        Consumer x = ()->{ System.out::println; }
//        Consumer x = System.out::println;
//        var x = System.out::println;
        Consumer x = (m)->{ };
//        Consumer x = (String msg)->{ System.out.println(msg); };
        List.of(args).forEach(x);
    }
}
