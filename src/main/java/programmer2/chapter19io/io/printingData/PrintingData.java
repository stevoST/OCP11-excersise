package programmer2.chapter19io.io.printingData;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.SQLOutput;

public class PrintingData {
    public static void main(String[] args) throws FileNotFoundException {
        try (PrintWriter out = new PrintWriter("zoo.log")) {
            out.write(String.valueOf(5));
            out.print(5);
            var a = new Chimpanzee();
            out.write(a == null ? "null" : a.toString());
            out.print(a);
            System.out.println();

            System.getProperty("line.separator");

            var pi = 3.14159265459;
            System.out.printf("[%12.8f]", pi);
            System.out.println();
            System.out.printf("[%012.8f]", pi);
            System.out.println();
            System.out.printf("[%012f] 012f", pi);
            System.out.println();
            System.out.printf("[%012.0f] 012.0f", pi);
            System.out.println();
            System.out.printf("[%012.2f]", pi);
            System.out.println();
            System.out.printf("[%05.2f]", pi);
        }
    }
}
