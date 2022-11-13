package programmer2.chapter14genericsandcollections.questions.question15;

import java.util.Arrays;
import java.util.Collections;

public class Comparator {

    public static void main(String[] args) {
    java.util.Comparator<Integer> c1 = (o1, o2) -> o2 - o1;
    java.util.Comparator<Integer> c2 = java.util.Comparator.naturalOrder();
    java.util.Comparator<Integer> c3 = java.util.Comparator.reverseOrder();

        var list = Arrays.asList(5,4,7,2);
        Collections.sort(list,c2);
        System.out.println(Collections.binarySearch(list,2));
    }
}
