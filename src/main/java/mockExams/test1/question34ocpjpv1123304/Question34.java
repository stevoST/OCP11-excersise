package mockExams.test1.question34ocpjpv1123304;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

public class Question34 {
    public static void main(String[] args) {
        var numA = new Integer[]{1, null, 3}; //1
        var list1 = List.of(numA); //2
        var list2 = Collections.unmodifiableList(list1); //3
        numA[1] = 2; //4
        System.out.println(list1+" "+list2);
    }
}
