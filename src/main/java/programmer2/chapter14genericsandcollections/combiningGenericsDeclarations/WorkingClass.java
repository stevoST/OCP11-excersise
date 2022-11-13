package programmer2.chapter14genericsandcollections.combiningGenericsDeclarations;

import java.util.ArrayList;
import java.util.List;

public class WorkingClass {
    public static void main(String[] args) {
        List<?> list1 = new ArrayList<A>();
        List<?> list12 = new ArrayList<B>();
        List<?> list13 = new ArrayList<C>();
        List<? extends A> list2 = new ArrayList<A>();
        List<? extends A> list21 = new ArrayList<B>();
        List<? extends A> list23 = new ArrayList<C>();
        List<? super A> list3 = new ArrayList<A>();
        List<? super A> list31 = new ArrayList<Object>();

//        List<? extends B> list14 = new ArrayList<A>();
        List<? super B> list5 = new ArrayList<A>();
//        List<?> list6 = new ArrayList<? extends A>();
//        List<A> list61 = new ArrayList<? extends A>();
//        List<Object> list62 = new ArrayList<? extends A>();

        List<?> list7 = new ArrayList<Integer>();
        List<? extends Number> list8 = new ArrayList<Integer>();
    }
}
