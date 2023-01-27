package programmer2.chapter18concurrency.questions.question19;

import java.util.concurrent.Executors;
import java.util.stream.DoubleStream;

public class Question19 {
    public static void main(String[] args) {
        var s = Executors.newScheduledThreadPool(10);
        DoubleStream.of(3.14159,2.71828)
                .forEach(c -> s.submit(
                        () -> System.out.println(10*c)
                ));
        s.execute(()-> System.out.println("Printed"));
    }
}
