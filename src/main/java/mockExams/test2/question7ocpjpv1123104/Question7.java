package mockExams.test2.question7ocpjpv1123104;

import java.util.Arrays;

public class Question7 {
    public static void main(String[] args) {
        var a = new int[]{1, 2, 3, 4, 5};
        var b = new int[]{1, 2, 3, 4, 5, 3};
        var c = new int[]{1, 2, 3, 4, 5, 6};
        var d = new int[]{1, 2, 3, 4, 5, 6};
        int x = Arrays.compare(a, c);
        int y = Arrays.compare(b, c);
        int z = Arrays.mismatch(c, d);
        System.out.println(x + " " + y + " " + z);
    }
}
