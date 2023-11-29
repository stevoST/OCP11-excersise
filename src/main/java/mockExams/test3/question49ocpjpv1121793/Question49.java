package mockExams.test3.question49ocpjpv1121793;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Question49 {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(10, 47, 33, 23);
        int max = ls.stream().max(Comparator.comparing(a->a)).get(); //INSERT code HERE
        System.out.println(max); //1
    }
}
