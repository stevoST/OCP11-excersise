package programmer2.chapter18concurrency.concurrencyApi.threadSafe;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SheepManagerSynchronized2 {
    //page 866
    private int sheepCount = 0;
    private final Object herd = new Object();
    private void incrementAndReport(){
        synchronized (herd) {
            System.out.print((++sheepCount) + " ");
        }
    }

    public static void main(String[] args) {
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(20);
            SheepManagerSynchronized2 manager = new SheepManagerSynchronized2();
            for(int i = 0; i<10 ; i++)
                service.submit(() -> manager.incrementAndReport());
        }finally {
            if(service != null) service.shutdown();
        }
    }
}
