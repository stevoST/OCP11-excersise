package programmer1.chapter8.question22;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class Child extends Person {
    static String name;

    void setName(String w) {
        name = w;
    }

    public static void main(String[] args) {
        final Child m = new Child();
        final Person t = m;
        m.name = "Elysia";
        System.out.println("Child: " + m.name + " Parent: " + t.name);
        t.name = "Sophia";
        System.out.println("Child: " + m.name + " Parent: " + t.name);
        m.setName("Webby");
        System.out.println("Child: " + m.name + " Parent: " + t.name);
        t.setName("Olivia");
        System.out.println("Child: " + m.name + " Parent: " + t.name);
    }
}
