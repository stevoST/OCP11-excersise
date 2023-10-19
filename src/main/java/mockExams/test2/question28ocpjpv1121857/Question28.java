package mockExams.test2.question28ocpjpv1121857;

import java.util.Arrays;
import java.util.List;

class MyProcessor {
    Integer value;

    public MyProcessor(Integer value) {
        this.value = value;
    }

    public void process() {
        System.out.println(value + " ");
    }
}

public class Question28 {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(1, 2, 3);
        ls.stream()
                .map(value -> new MyProcessor(value))
                .forEach(MyProcessor::process);
    }
}
