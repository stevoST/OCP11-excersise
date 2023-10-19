package mockExams.test2.question38ocpjpv1121688;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;

class MyCallable implements Callable<String> {
    public String call() throws Exception {
        Thread.sleep(5000);
        return "DONE";
    }
}

public class Question38 {
    public static void main(String[] args) throws Exception {
        var es = Executors.newSingleThreadExecutor();
        var future = es.submit(new MyCallable());
        System.out.println(future.get()); //1
        es.shutdownNow(); //2
        }
}
