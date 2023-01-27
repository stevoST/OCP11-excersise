package programmer2.chapter18concurrency.questions.question21;

import java.util.List;
import java.util.stream.Stream;

public class Question21 {
    public static void main(String[] args) {
        var data = List.of(List.of(1,2),
                List.of(3,4),
                List.of(5,6));
        data.stream()
                .flatMap(s -> s.stream())
                .findFirst()
                .ifPresent(System.out::println);

        System.out.println("");

        Stream.of(1,2,3,4,5,6).parallel().forEach(i -> System.out.print(i + " "));
        System.out.println("");
        Stream.of(1,2,3,4,5,6).parallel().findFirst().ifPresent(System.out::println);
    }
}
