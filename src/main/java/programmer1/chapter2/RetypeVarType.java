package programmer1.chapter2;

import java.util.HashMap;

public class RetypeVarType {
    public static void main(String[] args) {
        Object test = new Object();
        test = "print";
        Object test2 = new Object();
        test2 = "print";
        Object test3 = new Object();
        test3 = new HashMap<Integer,Integer>();
        System.out.println(test);
    }
}
