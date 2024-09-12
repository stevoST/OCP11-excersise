package mockExams.test7.question25v1123105;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question25 {
    public static void main(String[] args) {
        List<String> listOfStrings = List.of("a", "b", "c");
        ArrayList<String> als = new ArrayList<>(listOfStrings);
        Set<String> ss = new HashSet();
        ss.addAll(als); //1
        als.clear();    //2
        System.out.println(ss.size());
    }
}
