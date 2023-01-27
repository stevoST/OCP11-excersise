package programmer2.chapter18concurrency.questions.question26;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class CountZooAnimals {
    public static void performCount(int animal){
        // Implementation here
    }

    public static void printResults(Future<?> f){
        try{
            System.out.println(f.get(1, TimeUnit.DAYS));
        } catch (Exception e){
            System.out.println("Exception!");
        }
    }

    public static void main(String[] args) {
        ExecutorService s = null;
        final var r = new ArrayList<Future<?>>();
        try{
            s = Executors.newSingleThreadExecutor();
            for (int i = 0; i < 10; i++) {
                final int animal = i;
                r.add(s.submit(() -> performCount(animal)));
            }
            r.forEach(f->printResults(f));
        } finally {
            if (s != null) s.shutdown();
        }
    }

}
