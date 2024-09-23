package mockExams.test7.question17ocpjpv112971;

public class TestClass {
    public static void main(String args[]) {
        var i = 0;
        int[] iA = {10, 20};
        iA[i] = i = 30;
        System.out.println("" + iA[0] + " " + iA[1] + "  " + i);
    }
}