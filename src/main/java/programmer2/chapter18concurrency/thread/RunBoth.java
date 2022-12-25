package programmer2.chapter18concurrency.thread;

public class RunBoth {
    public static void main(String[] args) {
        System.out.println("begin");
        (new ReadInventoryThread()).start();
        (new Thread(new PrintData())).start();
        (new ReadInventoryThread()).start();
        System.out.println("end");


        //starting thread with run is synchronous
//        System.out.println("begin");
//        (new ReadInventoryThread()).run();
//        (new Thread(new PrintData())).run();
//        (new ReadInventoryThread()).run();
//        System.out.println("end");

    }
}
