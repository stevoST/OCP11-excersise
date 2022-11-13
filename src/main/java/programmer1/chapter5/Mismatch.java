package programmer1.chapter5;

import java.util.Arrays;

public class Mismatch {
    public static void main(String[] args) {
        int[] firstArray = {1,2,3,4};
        int[] secondArray = {1,1,3,4};
        int[] thirdArray = {5,6,7,8};
        int[] fourthArray = {1,2,3,4,5};
        int[] fifithArray = {1,2,3,4};
        int[] nullArray = null;
        System.out.println(Arrays.mismatch(firstArray,thirdArray));
        System.out.println(Arrays.mismatch(firstArray,secondArray));
        System.out.println("fourth Array is bigger: " + Arrays.mismatch(firstArray,fifithArray));
        System.out.println("same Arrays: " + Arrays.mismatch(firstArray,fourthArray));
//        System.out.println(Arrays.mismatch(firstArray,nullArray));
    }
}
