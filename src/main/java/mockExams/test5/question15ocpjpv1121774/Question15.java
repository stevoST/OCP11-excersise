package mockExams.test5.question15ocpjpv1121774;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Question15 {
    public static void main(String[] args) throws IOException {
        var raf = new RandomAccessFile("c:\\temp\\test.txt", "rwd");
        //INSERT CODE HERE
//        raf.writeChars("hello world"); // throws exception because its not UTF
        raf.writeUTF("hello world"); // throws exception because its not UTF
        raf.close();
        var dis = new DataInputStream(new FileInputStream("c:\\temp\\test.txt"));
        String value = dis.readUTF();
        System.out.print(value);
        dis.close();
    }
}
