package mockExams.test3.question7ocpjpv1121890;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question7 {
    public static void main(String[] args) {
        List<String> letters = Arrays.asList("j", "a", "v", "a");
        String word = letters.stream().reduce("", (a, b) -> a.concat(b));
        String word2 = letters.stream().collect(Collectors.joining());
        System.out.println(word);
        System.out.println(word2);
    }
}
