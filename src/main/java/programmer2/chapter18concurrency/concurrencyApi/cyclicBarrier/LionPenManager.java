package programmer2.chapter18concurrency.concurrencyApi.cyclicBarrier;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LionPenManager {
    private void removeLions(){
        System.out.println("Removing lions");
    }
    private void cleanPen(){
        System.out.println("Cleaning the pen");
    }
    private void addLions() {
        System.out.println("Adding lions");
    }
    public void performTask() {
        removeLions();
        cleanPen();
        addLions();
    }

    public static void main(String[] args) {
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(4);
            var manager = new LionPenManager();
            for( int i = 0; i<4; i++){
                service.submit(()->manager.performTask());
            }
        }finally {
            if(service != null) service.shutdown();
        }
    }
}
