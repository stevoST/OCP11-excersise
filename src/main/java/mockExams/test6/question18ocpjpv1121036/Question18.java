package mockExams.test6.question18ocpjpv1121036;

import java.util.Arrays;

public class Question18 {
    public static void main(String[] args) {
        var a = new int[]{1, 2, 3, 4};
        int[] b = {2, 3, 1, 0};
        System.out.println(a[(a = b)[3]]);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
