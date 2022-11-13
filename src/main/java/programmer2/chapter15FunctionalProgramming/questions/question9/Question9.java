package programmer2.chapter15FunctionalProgramming.questions.question9;

import java.util.stream.LongStream;

public class Question9 {
    public static void main(String[] args) {
        var stream = LongStream.of(1,2,3);
        var opt = stream.map(n->n*10)
                .filter(n->n<5).findFirst();

        if(opt.isPresent()){
            System.out.println(opt.getAsLong());
        }

        opt.ifPresent(System.out::println);
    }
}
