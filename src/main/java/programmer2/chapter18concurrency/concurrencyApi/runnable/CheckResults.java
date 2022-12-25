package programmer2.chapter18concurrency.concurrencyApi.runnable;


import java.util.concurrent.*;

public class CheckResults {
    private static int counter = 0;

    //page 853
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();
            Future<?> result = service.submit(() -> {
                for (int i = 0; i < 500; i++) CheckResults.counter++;
            });
            System.out.println(result.get(10, TimeUnit.SECONDS));
            System.out.println("Reached!");
        } catch (TimeoutException e){
            System.out.println("Not reached in time");
        } finally {
            if(service!=null) service.shutdown();
        }
        }
}
