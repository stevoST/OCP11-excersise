package programmer2.chapter15FunctionalProgramming.questions.question6;

import java.util.stream.Stream;

public class Question6 {
    public static void main(String[] args) {
        var s = Stream.generate(() -> "meow");
        var match = s.allMatch(String::isEmpty);
        System.out.println(match);
    }
}
