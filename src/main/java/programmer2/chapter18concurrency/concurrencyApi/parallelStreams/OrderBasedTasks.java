package programmer2.chapter18concurrency.concurrencyApi.parallelStreams;

import java.util.List;

public class OrderBasedTasks {
    public static void main(String[] args) {
        System.out.println(List.of(1, 2, 3, 4, 5)
                .stream()
                .findAny()
                .get());

        System.out.println(List.of(1, 2, 3, 4, 5)
                .parallelStream()
                .findAny()
                .get());

    }
}
