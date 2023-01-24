package programmer2.chapter18concurrency.concurrencyApi;

import java.util.Collections;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;

public class ZooInfo {
    public static void main(String[] args) {
        ExecutorService service = null;
        Runnable task1 = () ->
                System.out.println("Printing zoo inventory");
        Runnable task2 = () ->
        {
            for (int i = 0; i < 3; i++)
                System.out.println("Printing record: " + i);
        };

        try {
            service = Executors.newSingleThreadExecutor();
            System.out.println("begin");
            service.execute(task1);
            service.execute(task2);
            service.execute(task1);
            System.out.println("end");
            System.out.println("Available Processors: " + Runtime.getRuntime().availableProcessors());
            System.out.println("common pool: " + ForkJoinPool.commonPool());
        } finally {
            if (service != null) service.shutdown();
        }
    }
}
