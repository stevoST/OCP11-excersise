package mockExams.test7.question26ocpjpv1123333;

import java.util.List;
import java.util.stream.Collectors;

public class Question26 {
    public static void main(String[] args) {
        var nums = List.of(1, 2, 3, 4).stream();
        double average1 = nums.collect(Collectors.averagingInt(i -> i));
//        double average2 = nums.mapToObj(i->i).collect(Collectors.averagingInt(i->i));
//        double average3 = nums.average().getAsDouble();
//        double average4 = nums.parallel().mapToInt(i->i).average();
        double average5 = nums.parallel().mapToDouble(i -> i).average().getAsDouble();
    }
}
