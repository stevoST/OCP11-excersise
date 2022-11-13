package programmer2.chapter12fundamentals.questions.question17;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Hyena {
    private int age = 1;

    public static void main(String[] args) {
        var p = new Hyena();
        double height = 10;
        int age = 1;
        testLaugh(p,var -> p.age <=10);
        testLaugh(p,j->true);
        testLaugh(p,h->h.age < 5);
        age = 2;
    }

    static void testLaugh(Hyena panda, TestPredicate<Hyena> joke){
        var r = joke.test(panda) ? "hahaha" : "silence";
        System.out.println(r);
    }
}
