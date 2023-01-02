package programmer2.chapter18concurrency.concurrencyApi.parallelStreams;

import java.util.List;

public class TestParallelStream {
    //Page 890
    private static int doWork(int input) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {

        }
        return input;
    }

    public static void main(String[] args) {
//        normalStream();
//        parallelStream();
        parallelStreamOrdered();
    }

    public static void normalStream() {
        long start = System.currentTimeMillis();
        List.of(1, 2, 3, 4, 5)
                .stream()
                .map(w -> doWork(w))
                .forEach(s -> System.out.print(s + " "));

        System.out.println();
        var timeTaken = (System.currentTimeMillis() - start) / 1000;
        System.out.println("Time: " + timeTaken + " seconds");
    }

    public static void parallelStream() {
        long start = System.currentTimeMillis();
        List.of(1, 2, 3, 4, 5)
                .parallelStream()
                .map(w -> doWork(w))
                .forEach(s -> System.out.print(s + " "));

        System.out.println();
        var timeTaken = (System.currentTimeMillis() - start) / 1000;
        System.out.println("Time: " + timeTaken + " seconds");
    }

    public static void parallelStreamOrdered() {
        long start = System.currentTimeMillis();
        List.of(1, 2, 3, 4, 5)
                .parallelStream()
                .map(w -> doWork(w))
                .forEachOrdered(s -> System.out.print(s + " "));

        System.out.println();
        var timeTaken = (System.currentTimeMillis() - start) / 1000;
        System.out.println("Time: " + timeTaken + " seconds");
    }
}
