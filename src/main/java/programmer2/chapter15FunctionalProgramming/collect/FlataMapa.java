package programmer2.chapter15FunctionalProgramming.collect;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class FlataMapa {
    public static void main(String[] args) {
        List<String> zero = List.of();
        var one = List.of("Bonobo");
        var two = List.of("Mama Gorilla", "Baby Gorilla");
        var three = List.of("Moo", "Bee");
        var listOfLists = List.of(one,two,three);
        Stream<List<String>> animals = Stream.of(zero,one,two);
        Stream<List<List<String>>> animals1 = Stream.of(listOfLists);

//        animals.flatMap(m-> m.stream()).forEach(System.out::println);
        animals1.flatMap(m-> m.stream()).forEach(System.out::println);
    }
}
