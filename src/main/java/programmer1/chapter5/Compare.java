package programmer1.chapter5;

import java.util.Arrays;

public class Compare {
    public static void main(String[] args) {
        int[] firstArray = {1,2,3,4};
        int[] secondArray = {1,1,3,4};
        int[] thirdArray = {5,6,7,8};
        int[] fourthArray = {1,2,3,4,5};
        int[] nullArray = null;
        System.out.println(Arrays.compare(firstArray,thirdArray));
        System.out.println("fourth Array is bigger: " + Arrays.compare(firstArray,fourthArray));
        System.out.println(Arrays.compare(firstArray,nullArray));
        String[] firstStringArray = {"Peacock"};
        String[] secondStringArray = {"Llama"};
        System.out.println("String " + Arrays.compare(firstStringArray,secondStringArray));
    }
}
