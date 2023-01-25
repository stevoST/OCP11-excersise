package programmer2.chapter18concurrency.questions.question13;

import java.util.List;

public class Question13 {
    public static void main(String[] args) {
//        System.out.println(List.of("duck","flamingo","pelican")
//                .parallelStream()
//                .parallel()
//                .reduce(0,
//                        (c1,c2) -> c1.length() + c2.length(),
//                        (s1,s2) -> s1 + s2)
//        );

                System.out.println(List.of("duck","flamingo","pelican")
                .parallelStream()
                .parallel()
                .reduce(0,
                        (c1,c2) -> c1 + c2.length(),
                        (s1,s2) -> s1 + s2)
        );

        System.out.println(List.of("duck","flamingo","pelican")
                .parallelStream()
                .parallel()
                .reduce("",
                        (c1,c2) -> c1 + c2,
                        (s1,s2) -> s1 + s2)
        );
    }
}
