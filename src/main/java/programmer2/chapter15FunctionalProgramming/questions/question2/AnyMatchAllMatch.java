package programmer2.chapter15FunctionalProgramming.questions.question2;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class AnyMatchAllMatch {
    public static void main(String[] args) {
        Predicate<String> predicate = s -> s.startsWith("g");
        var stream1 = Stream.generate(() -> "growl!");
        var stream2 = Stream.generate(() -> "growl!");
        var b1 = stream1.anyMatch(predicate);
        var b2 = stream2.allMatch(predicate);
        System.out.println(b1 + " " + b2);
    }
}
