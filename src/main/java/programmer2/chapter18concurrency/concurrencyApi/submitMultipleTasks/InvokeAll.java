package programmer2.chapter18concurrency.concurrencyApi.submitMultipleTasks;

import java.util.List;
import java.util.concurrent.*;

public class InvokeAll {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService service = Executors.newFixedThreadPool(5);
        System.out.println("begin");
        Callable<String> task = () -> "result";
        List<Future<String>> list = service.invokeAll(List.of(task, task, task));
        for(Future<String> future : list){
            System.out.println(future.get());
        }
        System.out.println("end");
        service.shutdown();
    }
}
