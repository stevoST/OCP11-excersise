package programmer2.chapter18concurrency.thread;

//extendin thread should not be used. mostly
public class ReadInventoryThread extends Thread {
    @Override public void run(){
        System.out.println("Printin zoo inventory");
    }

    public static void main(String[] args) {
        (new Thread(new ReadInventoryThread())).start();
    }
}
