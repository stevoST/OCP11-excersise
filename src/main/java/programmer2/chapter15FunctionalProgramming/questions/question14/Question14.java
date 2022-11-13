package programmer2.chapter15FunctionalProgramming.questions.question14;


import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Question14 {
    public static void main(String[] args) {
        Stream<Integer> s = Stream.of(1, 2, 3);
//        IntStream is = s.boxed();
        DoubleStream ds = s.mapToDouble(x -> x);
//        Stream<Integer> s2 = ds.mapToInt(x->x);
    }
}
