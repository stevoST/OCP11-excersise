package programmer2.chapter12fundamentals.enumImplicitPrivate;

public class OtherClass {
    public static void main(String[] args) {
        Season season = Season.SPRING;
        Season.FALL.printExpectedVisitors();
    }

}
