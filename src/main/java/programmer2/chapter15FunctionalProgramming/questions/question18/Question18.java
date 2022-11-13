package programmer2.chapter15FunctionalProgramming.questions.question18;

import java.util.stream.DoubleStream;

public class Question18 {
    public static void main(String[] args) {
        var s = DoubleStream.of(1.2, 2.4);
        s.peek(System.out::println).filter(x->x>2).count();
        s.filter(x->x>2).peek(System.out::println).count();

    }
}
