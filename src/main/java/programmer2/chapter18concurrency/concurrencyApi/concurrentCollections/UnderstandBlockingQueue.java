package programmer2.chapter18concurrency.concurrencyApi.concurrentCollections;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class UnderstandBlockingQueue {
    //Page 882

    public static void main(String[] args) {
        try {
            var blockingQueue = new LinkedBlockingQueue<Integer>();
            blockingQueue.offer(39);
//            blockingQueue.offer(3);
            blockingQueue.offer(3, 4, TimeUnit.SECONDS);
            System.out.println(blockingQueue.poll());
//            System.out.println(blockingQueue.poll());
            System.out.println(blockingQueue.poll(10, TimeUnit.MILLISECONDS));
        } catch (InterruptedException e) {
            //handle interruption
        }
    }
}
