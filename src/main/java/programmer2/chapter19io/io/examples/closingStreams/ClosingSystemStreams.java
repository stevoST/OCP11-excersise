package programmer2.chapter19io.io.examples.closingStreams;

import java.io.*;

public class ClosingSystemStreams {
    public static void main(String[] args) throws IOException {
//        it doenst print out exception when you close err stream
//        try(var err = System.err){}

//        System.out.println("test");
//        PrintStream test = null;
//        test.println("test");

//        ByteArrayOutputStream baos = new ByteArrayOutputStream();
//        PrintStream test2 = new PrintStream(baos);
//        test2.println("hehe");
//        System.out.println( baos.toString());

        var reader = new BufferedReader(new InputStreamReader(System.in));
        try (reader) {
        }
        String data = reader.readLine();
    }
}
