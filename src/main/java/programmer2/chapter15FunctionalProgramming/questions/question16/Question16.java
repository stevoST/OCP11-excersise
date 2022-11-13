package programmer2.chapter15FunctionalProgramming.questions.question16;

import java.util.Collection;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question16 {
    public static void main(String[] args) {
        Predicate<String> empty = String::isEmpty;
        Predicate<String> notEmpty = empty.negate();

        var result = Stream.generate(()->"")
                .limit(10)
                .filter(notEmpty)
                .collect(Collectors.groupingBy(k->k))
                .entrySet()
                .stream()
                .map(Map.Entry::getValue)
                .flatMap(Collection::stream)
                .collect(Collectors.partitioningBy(notEmpty));
//                .collect(Collectors.groupingBy(n->n));
        System.out.println(result);

    }
}
