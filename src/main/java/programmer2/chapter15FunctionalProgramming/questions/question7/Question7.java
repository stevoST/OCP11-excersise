package programmer2.chapter15FunctionalProgramming.questions.question7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Question7 {
    public static void main(String[] args) {
        List<String> unsorted = List.of("test", "a","neviem");
        System.out.println(sort(unsorted));
        System.out.println(sort1(unsorted));
    }

    private static List<String> sort(List<String> list) {
        var copy = new ArrayList<String>(list);
        Collections.sort(copy, (a, b) -> b.compareTo(a));
        return copy;
    }

    private static List<String> sort1(List<String> list) {
        return list.stream().sorted((a, b) -> b.compareTo(a)).collect(Collectors.toList());
    }
}
