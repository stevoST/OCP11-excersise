package programmer2.chapter18concurrency.questions.question20;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;

public class PrintCounter {
    static int count = 0;

    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        ExecutorService service = null;
        final ExecutorService service = Executors.newSingleThreadExecutor();;
        try {
//            service = Executors.newSingleThreadExecutor();
            var r = new ArrayList<Future<?>>();
            IntStream.iterate(0,i->i+1).limit(5).forEach(
//                    i -> r.add(service.execute(()-> {count++;})) //n1
                    i -> r.add(service.submit(()-> {count++;}))
            );
            for(Future<?> result : r){
                System.out.println(result.get()+" "); //n2
            }
        } finally {
            if(service != null) service.shutdown();
        }
    }
}
