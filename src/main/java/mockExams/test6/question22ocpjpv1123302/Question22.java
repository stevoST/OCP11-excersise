package mockExams.test6.question22ocpjpv1123302;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Question22 {
    public static void main(String[] args) {
        Collection<Integer> col = new HashSet<>();
        col.add(1);
        var list1 = List.of(col); //1
        col.add(2); //2
        var list2 = List.copyOf(col); //3
        System.out.println(list1 + ", " + list2);
    }
}
