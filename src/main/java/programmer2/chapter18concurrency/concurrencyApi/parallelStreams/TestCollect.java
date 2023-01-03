package programmer2.chapter18concurrency.concurrencyApi.parallelStreams;


import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestCollect {
    //Page 895
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("w", "o", "l", "f")
                .parallel();
        SortedSet<String> set = stream.collect(ConcurrentSkipListSet::new,
                Set::add,
                Set::addAll);
        System.out.println(set);
    }
}
