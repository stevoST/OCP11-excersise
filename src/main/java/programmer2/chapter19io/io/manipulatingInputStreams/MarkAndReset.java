package programmer2.chapter19io.io.manipulatingInputStreams;

import java.io.*;

public class MarkAndReset {
    public static void main(String[] args) throws IOException {
        //page 931
        MarkAndReset mr = new MarkAndReset();
        String inputString = "LION";
        InputStream is = new ByteArrayInputStream(inputString.getBytes());
        mr.readData(is);
    }

    public void readData(InputStream is) throws IOException {
        System.out.println((char) is.read());
        if (is.markSupported()) {
            is.mark(0);
            System.out.println((char) is.read());
            System.out.println((char) is.read());
            is.reset();
        }
        System.out.println((char) is.read());
        System.out.println((char) is.read());
        System.out.println((char) is.read());
        System.out.println((char) is.read());
    }
}