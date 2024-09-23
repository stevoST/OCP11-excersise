package mockExams.test4.question18ocpjpv1121011;


public class TestClass2 {

    public void method(Object o) {
        System.out.println("Object Version");
    }

    public void method(String s) {
        System.out.println("String Version");
    }

    public void method(StringBuffer s) {
        System.out.println("StringBuffer Version");
    }

    public static void main(String args[]) {
        TestClass tc = new TestClass();
//        tc.method(null);
    }
}
