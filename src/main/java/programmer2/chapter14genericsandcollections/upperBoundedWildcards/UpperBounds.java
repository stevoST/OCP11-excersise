package programmer2.chapter14genericsandcollections.upperBoundedWildcards;

import java.util.ArrayList;
import java.util.List;

public class UpperBounds {
    static class Sparrow extends Bird{}
    static class Bird {}

    public static void main(String[] args) {
        List<? extends Bird> birds = new ArrayList<>();
//        birds.add(new Sparrow());
//        birds.add(new Bird());

        List<Bird> birds1 = new ArrayList<>();
        birds1.add(new Bird());
        birds1.add(new Bird());
        add(birds1);

        List<Sparrow> sparrow = new ArrayList<>();
        sparrow.add(new Sparrow());
        sparrow.add(new Sparrow());
        add(sparrow);
    }

    public static void add(List<? extends Bird> birds){
        System.out.println(birds);
    }
}
