package mockExams.test6.question45ocpjpv1123548;

public class Question45 {
    public static void main(String[] args) {
        byte b = 1;
        char c = 1;
        short s = 1;
        int i = 1;

//        s = b * b;
        i = b + b;
        s *= b;
//        c = c + b;
        s += i;
//        s = s + i; // does not compile
    }
}
