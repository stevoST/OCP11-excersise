package programmer1.chapter6;

import java.util.ArrayList;
import java.util.List;

public class ListComparatorOrder {
    public static void main(String[] args) {
        List<String> cats = new ArrayList<>();
        cats.add("leo");
        cats.add("Olivia");

        cats.sort((c1,c2)-> -c1.compareTo(c2));
        System.out.println(cats);
    }
}
