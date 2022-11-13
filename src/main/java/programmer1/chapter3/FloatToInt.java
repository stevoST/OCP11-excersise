package programmer1.chapter3;

import java.util.ArrayList;
import java.util.List;

public class FloatToInt {
    public static void main(String[] args) {
        float floatNumber = (float) Integer.MAX_VALUE + 1000;
        int maximumInt = Integer.MAX_VALUE;
        float result = floatNumber - maximumInt;
        System.out.println(result);
    }
}
