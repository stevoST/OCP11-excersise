package mockExams.test3.question51ocpjpv1123635;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

class TestClass {
    public static void main(String[] args) throws IOException {
        final InputStream fis = new FileInputStream("c:\\temp\\test.txt");
        long l = 0;
        try (fis) {
            l = fis.read();//1
        } finally {
            l = fis.read();//2
        }
        l = fis.read();//3
        System.out.println(l);//4
    }
}
