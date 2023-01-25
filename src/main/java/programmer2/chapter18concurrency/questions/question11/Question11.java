package programmer2.chapter18concurrency.questions.question11;

import java.util.List;

public class Question11 {
    public static void main(String[] args) {
        Integer i1 = List.of(1,2,3,4,5).stream().findAny().get();
        synchronized (i1){
            Integer i2 = List.of(6,7,8,9,10)
                    .parallelStream()
                    .sorted()
                    .findAny()
                    .get();
            System.out.println(i1 + " " + i2);
        }
    }
}
