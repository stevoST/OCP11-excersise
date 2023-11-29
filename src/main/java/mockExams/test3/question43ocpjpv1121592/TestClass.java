package mockExams.test3.question43ocpjpv1121592;

import java.util.ArrayList;
import java.util.List;

public class TestClass {
    public static void main(String[] args) {
        List<Birdie> m = new ArrayList<>();
        m.add(new Dino());
        m.add(new Bino());
        for (Birdie b : m) {
            b.fly();
            b.eat();
        }
    }
}