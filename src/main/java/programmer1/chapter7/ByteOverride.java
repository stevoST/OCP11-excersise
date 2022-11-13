package programmer1.chapter7;

import java.util.List;

public class ByteOverride {
    public void print(short x) {
        System.out.println("short-");
    }

    public void print(int x) {
        System.out.println("int-");
    }

    public void print(List<String> test) {
        System.out.println("int-");
    }

    public static void main(String[] args) {
        ByteOverride bo = new ByteOverride();
        short s = 123;
        bo.print(s);
    }
}
