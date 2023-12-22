package mockExams.test4.question31;

import java.util.Arrays;
import java.util.List;

public class Question31 {
    public static void main(String[] args) {
        List<String> al = Arrays.asList("aa", "aaa", "b", "cc", "ccc", "ddd", "a");
        //INSERT CODE HERE
//        long count = al.stream().filter((str)->str.compareTo("c")<0).count();
        long count = al.stream().filter((str)->str.compareTo("c")<0).sorted().count();
        System.out.println(count);
    }
}
