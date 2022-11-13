package programmer2.chapter12fundamentals.enumConstructorCall;

public class PrintTheOne {
    public static void main(String[] args) {
        System.out.println("begin");
        OnlyOne firstCall = OnlyOne.ONCE;
        OnlyOne secondCall = OnlyOne.ONCE;
        System.out.println("end");
    }
}
