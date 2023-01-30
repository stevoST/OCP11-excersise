package programmer2.chapter18concurrency.questions.question4;

import java.util.concurrent.*;

public class Question4 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        ExecutorService service = Executors.newSingleThreadScheduledExecutor();
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        service.scheduleWithFixedDelay(()-> {
            System.out.println("open zoo");
//            return null;
        },0,1, TimeUnit.MINUTES);
        var result = service.submit(() -> System.out.println("Wake Staff"));
        System.out.println(result.get());
    }
}
