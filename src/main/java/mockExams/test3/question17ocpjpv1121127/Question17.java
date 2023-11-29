package mockExams.test3.question17ocpjpv1121127;

import java.util.ArrayDeque;
import java.util.Deque;

public class Question17 {
    public static void main(String[] args) {
        Deque<Integer> d = new ArrayDeque<>();
        d.add(1);
        d.add(2);
        d.addFirst(3);
        System.out.println(d.pollLast());
        System.out.println(d.pollLast());
        System.out.println(d.pollLast());
    }
}
