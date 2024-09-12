package programmer2.chapter15FunctionalProgramming.reduce;

import java.util.stream.Stream;

public class ThreeArgumentReduce {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("w", "o", "l", "f!");
//        int length = stream.reduce(0, (integer, string) -> integer + string.length(), (a,b) -> a+b);
        int length = stream.reduce(0, (integer, string) -> integer + string.length(), (a,b) -> a+b);
        System.out.println(length);
    }
}
