package programmer2.chapter18concurrency.questions.question8;

import java.util.stream.LongStream;

public class Flavors {
        private static int counter;
    public static void countIceCreamFlavors(){
        counter = 0;
        Runnable task = () -> counter++;
        LongStream.range(1,500).forEach(m -> new Thread(task).run());
        System.out.println(counter);
    }

    public static void main(String[] args) {
        countIceCreamFlavors();
    }
}
