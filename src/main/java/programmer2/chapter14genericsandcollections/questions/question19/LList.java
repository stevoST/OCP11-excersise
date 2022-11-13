package programmer2.chapter14genericsandcollections.questions.question19;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LList {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(12);
        list.remove(1);
        System.out.println(list);
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(12);
        queue.remove(1);
        System.out.println(queue);
    }
}
