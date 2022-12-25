package programmer2.chapter18concurrency.thread.polling;

public class CheckResultsWithSleep {
    //page 848
    private static int counter = 0;
    public static void main(String[] args) throws InterruptedException {
        new Thread(()->{
            for(int i = 0; i<500;i++) CheckResultsWithSleep.counter++;
        }).start();

        while (CheckResultsWithSleep.counter<100){
            System.out.println("Not reached yet");
            Thread.sleep(1000);
        }
        System.out.println("Reached!");
    }
}
