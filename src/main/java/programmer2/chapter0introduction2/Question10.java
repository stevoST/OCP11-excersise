package programmer2.chapter0introduction2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Question10 {
    public static void main(String[] args) {
//        Set<? extends RuntimeException> mySet1 = new HashSet<? extends RuntimeException>();
//        Set<? extends RuntimeException> mySet2 = new HashSet<Exception>();
        Set<? extends RuntimeException> mySet3 = new TreeSet<RuntimeException>();
        Set<? extends RuntimeException> mySet4 = new TreeSet<NullPointerException>();
    }
}
