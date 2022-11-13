package programmer2.chapter14genericsandcollections.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class BinarySearchWithComparator {
    public static void main(String[] args) {
        var names = Arrays.asList("Fluffy", "Hoppy");
        Comparator<String> c = Comparator.reverseOrder();
        var index = Collections.binarySearch(names,"Hoppy",c);
        var index2 = Collections.binarySearch(names,"Test",c);
        System.out.println(index);
        System.out.println(index2);
    }
}
