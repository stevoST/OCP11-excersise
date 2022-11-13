package programmer1.chapter9.question12;

import java.io.IOError;
import java.io.IOException;

public class FruitStand {
    public static void main(String... farn) {
        Gala g = new Gala();
        Tangerine t = new Tangerine();
        Citrus c = new Citrus();
//        System.out.println(t instanceof Gala);
        System.out.println(c instanceof Tangerine);
        System.out.println(g instanceof Apple);
        System.out.println(t instanceof Apple);
//        System.out.println(c instanceof Apple);

        //custom tests
        IOException ioe = new IOException();
//        System.out.println(ioe instanceof  RuntimeException);
        System.out.println(g instanceof Orange);
    }
}
