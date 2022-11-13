package programmer2.chapter15FunctionalProgramming.collect;

import java.util.TreeSet;
import java.util.stream.Stream;

public class Collect {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("w", "o", "l", "f");
        StringBuilder word = stream.collect(
                StringBuilder::new,
                StringBuilder::append,
                StringBuilder::append
        );
        System.out.println(word);

        Stream<String> stream2 = Stream.of("w", "o", "l", "f");
        TreeSet<String> word2 = stream.collect(
                TreeSet::new,
                TreeSet::add,
                TreeSet::addAll
        );
        System.out.println(word2);
    }
}
