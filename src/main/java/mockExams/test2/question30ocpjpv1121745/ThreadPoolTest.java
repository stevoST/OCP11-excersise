package mockExams.test2.question30ocpjpv1121745;

import java.util.concurrent.*;

public class ThreadPoolTest {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("In Runnable");
        Callable<Integer> c = () -> {
            System.out.println("In Callable");
            return 0;
        };
        var es = Executors.newCachedThreadPool();
        //INSERT CODE HERE
        es.execute(r); // works for runnable
        es.submit(c);
        es.submit(r);

        Future<Integer> fi1 = es.submit(c);
        Future<?> rf = es.submit(r); // works
//        Future<Integer> fi1 = es.submit(r); // does not compile, cannot determine return object for runnable which is void
//        Future<Object> fi2 = es.submit(r); // does not compile, cannot determine return object for runnable which is void

        es.shutdown();
    }
}