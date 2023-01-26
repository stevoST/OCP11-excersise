package programmer2.chapter18concurrency.questions.question14;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class Question14 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Object o1 = new Object();
        Object o2 = new Object();
        var service = Executors.newFixedThreadPool(2);
        var f1 = service.submit(()-> {
            synchronized (o1){
                synchronized (o2){
                    System.out.println("Tortoise");
                }
            }
        });
        var f2 = service.submit(()-> {
            synchronized (o2){
                synchronized (o1){
                    System.out.println("Hare");
                }
            }
        });
        f1.get();
        f2.get();
    }
}
