package programmer2.chapter15FunctionalProgramming.questions.question5;

import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Question5 {
    public static void main(String[] args) {
        double result = LongStream.of(6L, 8L, 10L)
                .mapToInt(x -> (int) x)
                .boxed()
                .collect(Collectors.groupingBy(x -> x,Collectors.toSet()))
                .keySet()
                .stream()
                .collect(Collectors.averagingInt(x -> x));
        System.out.println(result);

    }
}
