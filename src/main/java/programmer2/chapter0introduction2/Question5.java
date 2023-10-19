package programmer2.chapter0introduction2;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class Question5 {
    public static void main(String[] args) {
        final var cb = new CyclicBarrier(3, () -> System.out.println("Clean!"));
        ExecutorService service = Executors.newSingleThreadExecutor();
        try {
            IntStream.generate(() -> 1)
                    .limit(12)
                    .parallel()
                    .forEach(i -> service.submit(() -> cb.await()));
        } finally {
            if (service != null) service.shutdown();
        }
    }
}
