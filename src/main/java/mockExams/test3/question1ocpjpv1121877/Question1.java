package mockExams.test3.question1ocpjpv1121877;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Question1 {
    public static void main(String[] args) {
        List<String> vowels = new ArrayList<String>();
        vowels.add("a");
        vowels.add("e");
        vowels.add("i");
        vowels.add("o");
        vowels.add("u");
        Function<List<String>, List<String>> f = list -> list.subList(2, 4);
//        f.apply(vowels);
        List<String> view = f.apply(vowels);//get a view backed by the original list
        view.add("x");//modify the view vowels.forEach(System.out::print);
        vowels.forEach(System.out::print);
    }
}
