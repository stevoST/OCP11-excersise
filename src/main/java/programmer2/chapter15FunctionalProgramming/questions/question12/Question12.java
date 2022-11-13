package programmer2.chapter15FunctionalProgramming.questions.question12;

import java.util.function.*;
import java.util.stream.Stream;

public class Question12 {
    public static void main(String[] args) {
//        BiConsumer<String,String> x = String::new;
//        Predicate<Stream> x = String::new;
        Supplier<String> x = String::new;

//        BiConsumer<String,String> y = m.andThen(n);
//        Predicate<Stream> y = m.andThen(n);
//        Supplier<String> y = m.andThen(n);
//        UnaryOperator<String> y = m.andThen(n);

//        BiConsumer<String,String> z = a -> a+a;
//        Predicate<Stream> z = a -> a+a;
//        Supplier<String> z = a -> a+a;
        UnaryOperator<String> z = a -> a+a;

    }
}
