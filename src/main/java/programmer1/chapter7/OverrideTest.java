package programmer1.chapter7;

public class OverrideTest {
    public static void main(String[] args) {
        integer(3);
    }

    public static void integer(int value){
        System.out.println("int");
    }

    public static void integer(int... value){
        System.out.println("Array");
    }
}
