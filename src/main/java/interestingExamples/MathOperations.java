package interestingExamples;

import java.util.ArrayList;

public class MathOperations {
    public static void main(String[] args) {
        int i = 0;
        int j = 5;
        int k = 10;
        int loopIterations = 0;
        while ((i++ < j) || (j < --k)) {
            loopIterations++;
        }
        System.out.println(loopIterations);

        int number = 10;
        int result = number-- - number++ * --number;
        System.out.println(result);
    }
}
