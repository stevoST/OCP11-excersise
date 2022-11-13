package programmer2.chapter15FunctionalProgramming.questions.question10;

import java.util.stream.Stream;

public class Question10 {
    public static void main(String[] args) {
        Stream.generate(()->"1")
//                .filter(x->x.length()>1)
//                .forEach(System.out::println);
                .limit(10)
                .peek(System.out::println);
    }
}
