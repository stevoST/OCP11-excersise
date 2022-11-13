package programmer2.chapter15FunctionalProgramming.questions.question11;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question11 {
    public static void main(String[] args) {
//        System.out.println(
//        Stream.iterate(1,x->x++)
//                .limit(5).map(x-> x)
//                .collect(Collectors.joining())
//        );

        System.out.println(
                Stream.iterate(1,x->x++).peek(System.out::println)
                        .limit(5).map(x->""+x)
                        .collect(Collectors.joining())
        );
    }
}
