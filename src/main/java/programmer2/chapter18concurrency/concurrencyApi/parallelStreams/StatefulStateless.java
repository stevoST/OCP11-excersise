package programmer2.chapter18concurrency.concurrencyApi.parallelStreams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StatefulStateless {
    //Page 897
    //statefull method
    public static List<Integer> addValues(IntStream source) {
        var data = Collections.synchronizedList(new ArrayList<Integer>());
        source.filter(s -> s % 2 == 0)
                .forEach(i -> {
                    data.add(i);
                });
        return data;
    }

    //stateless
    public static List<Integer> addValues2(IntStream source) {
        return source.filter(s -> s % 2 == 0)
                .boxed()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        var list = addValues((IntStream.range(1, 11)));
//        var list = addValues((IntStream.range(1, 11)).parallel());
        var list2 = addValues((IntStream.range(1, 11)));
//        var list2 = addValues2((IntStream.range(1, 11).parallel()));
        System.out.println(list);
        System.out.println(list2);
    }
}
