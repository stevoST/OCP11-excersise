package programmer2.chapter18concurrency.questions.question6;

import java.util.List;

public class Question6 {
    public static void main(String[] args) {
        var data = List.of(2,5,1,9,8);
        data.stream().parallel()
                .mapToInt(s->s)
                .peek(System.out::println)
                .forEachOrdered(System.out::println);
    }
}
