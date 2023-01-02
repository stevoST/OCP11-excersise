package programmer2.chapter18concurrency.concurrencyApi.parallelStreams;

import java.util.List;

public class TestReduce {
    //Page 893
    public static void main(String[] args) {
        System.out.println(
                List.of('w', 'o', 'l', 'f')
                        .parallelStream()
                        .reduce("",
                                (s1, c) -> s1 + c,
                                (s2, s3) -> s2 + s3)
        );
        System.out.println(
                List.of('w', 'o', 'l', 'f')
                        .parallelStream()
                        .reduce("",
                                (s1, c) -> s1 + c,
                                (s2, s3) -> s3 + s2)
        );
        System.out.println(
                List.of('w', 'o', 'l', 'f', 'i', 'e', 's', '1', '2', '3')
                        .parallelStream()
                        .reduce("",
                                (s1, c) -> s1 + c,
                                (s2, s3) -> s3 + s2)
        );
        System.out.println(
                List.of("one", "two", "three", "four", "five", "six", "seven")
                        .parallelStream()
                        .reduce(0,
                                (length, curword) -> length + curword.length(),
                                (size1, size2) -> size1 + size2)

        );
        System.out.println(
                List.of(1,2,3,4,5,6)
                        .parallelStream()
                        .reduce(0, (a,b)->(a-b))
        );

        System.out.println(
                List.of("w", "o", "l", "f")
                        .parallelStream()
                        .reduce("X", String::concat)
        );
    }
}
