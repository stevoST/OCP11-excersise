package programmer2.chapter18concurrency.concurrencyApi.submitMultipleTasks;

import java.util.List;
import java.util.concurrent.*;

public class InvokeAny {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService service = Executors.newFixedThreadPool(5);
        System.out.println("begin");
        Callable<String> task = () -> "result";
        String data = service.invokeAny(List.of(task, task, task));
        System.out.println(data);
        System.out.println("end");
        service.shutdown();
    }
}
