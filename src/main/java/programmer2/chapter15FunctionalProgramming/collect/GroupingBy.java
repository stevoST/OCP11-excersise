package programmer2.chapter15FunctionalProgramming.collect;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingBy {
    public static void main(String[] args) {
        var ohMy = Stream.of("lions", "tigers", "bears");
        Map<Integer, List<String>> map = ohMy.collect(
                Collectors.groupingBy(String::length)
        );
        System.out.println(map);

        var ohMy2 = Stream.of("lions", "tigers", "bears");
        var map2 = ohMy2.collect(
                Collectors.groupingBy(
                        String::length,
                        Collectors.mapping(s -> s.charAt(0),Collectors.minBy((a,b)->a-b))
                )
        );
        System.out.println(map2);
    }
}
