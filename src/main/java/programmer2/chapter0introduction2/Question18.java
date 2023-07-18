package programmer2.chapter0introduction2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.IntStream;

public class Question18 {
    public static void main(String[] args) {
//        List<Integer> data = new ArrayList<>();
//        IntStream.range(0,100).parallel().forEach(s -> data.add(s));
//        System.out.println(data.size());

//        List<Integer> data = new CopyOnWriteArrayList<>();
//        IntStream.range(0,100).parallel().forEach(s -> data.add(s));
//        System.out.println(data.size());

//        List<Integer> data = new ArrayList<>();
//        IntStream.range(0,100).forEach(s -> data.add(s));
//        System.out.println(data.size());

//        List<Integer> data = new ArrayList<>();
//        IntStream.range(0,100).parallel().forEachOrdered(s -> data.add(s));
//        System.out.println(data.size());

        List<Integer> data = new ArrayList<>();
        IntStream.range(0,100).parallel().forEach(s -> data.add(s));
        System.out.println(Collections.synchronizedList(data).size());
    }
}
