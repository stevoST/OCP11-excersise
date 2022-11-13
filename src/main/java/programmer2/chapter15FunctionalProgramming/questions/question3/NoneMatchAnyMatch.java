package programmer2.chapter15FunctionalProgramming.questions.question3;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class NoneMatchAnyMatch {
    public static void main(String[] args) {
        Predicate<String> predicate = s -> s.length() > 3;
        var stream = Stream.iterate("-", s -> !s.isEmpty(), (s) -> s + s);
        var b1 = stream.noneMatch(predicate);
        var b2 = stream.anyMatch(predicate);
        System.out.println(b1 + " " + b2);
    }
}
