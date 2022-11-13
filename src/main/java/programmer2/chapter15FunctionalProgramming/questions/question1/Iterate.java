package programmer2.chapter15FunctionalProgramming.questions.question1;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iterate {
    public static void main(String[] args) {
        var stream = Stream.iterate("", (s) -> s + "1");
        System.out.println(stream.limit(2).map(x -> x + "2").collect(Collectors.toList()));
    }
}
