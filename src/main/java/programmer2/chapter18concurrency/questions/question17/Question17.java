package programmer2.chapter18concurrency.questions.question17;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class Question17 {
    public static void main(String[] args) throws InterruptedException {
        addAndPrintItems(new LinkedBlockingQueue<>());
    }

    public static void addAndPrintItems(BlockingQueue<Integer> queue) throws InterruptedException {
        queue.offer(103);
        queue.offer(20, 1, TimeUnit.SECONDS);
        queue.offer(85, 7, TimeUnit.HOURS);
        System.out.println(queue.poll(200, TimeUnit.NANOSECONDS));
        System.out.println(" " + queue.poll(1, TimeUnit.MINUTES));
    }
}
