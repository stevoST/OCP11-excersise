package programmer2.chapter15FunctionalProgramming.questions.question13;

import java.util.List;
import java.util.stream.Stream;

public class Question13 {
    public static void main(String[] args) {
        List<Integer> x1 = List.of(1,2,3);
        List<Integer> x2 = List.of(4,5,6);
        List<Integer> x3 = List.of();
        Stream.of(x1,x2,x3)
                .flatMap(x->x.stream())
                .map(x->x+1)
                .forEach(System.out::println);
    }
}
