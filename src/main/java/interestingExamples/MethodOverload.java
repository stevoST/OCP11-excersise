package interestingExamples;

public class MethodOverload {
    public static void main(String[] args) {
        overload();
    }

    static void overload(int... i) {
        System.out.println("We are ints");
    }

    static void overload(double... d) {
        System.out.println("We are doubles");
    }

    static void overload(float... i) {
        System.out.println("We are floats");
    }
}
