package programmer1;

import java.util.Arrays;
import java.util.List;

public class Stream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3);

        int factor[] = new int[]{2};

        java.util.stream.Stream<Integer> stream = numbers.stream()
                .map(integer -> integer * factor[0]);

        factor[0] = 0;
        stream.forEach(System.out::println);

    }
}
