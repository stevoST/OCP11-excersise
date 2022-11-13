package programmer2.chapter15FunctionalProgramming;

import java.util.stream.Stream;

public class Generate {
    public static void main(String[] args) {
        Stream.generate(()->"string").forEach(System.out::println);
    }
}
