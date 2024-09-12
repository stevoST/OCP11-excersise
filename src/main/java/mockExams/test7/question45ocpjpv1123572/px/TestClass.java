package mockExams.test7.question45ocpjpv1123572.px;

import mockExams.test7.question45ocpjpv1123572.p1.Movable;
import mockExams.test7.question45ocpjpv1123572.p2.Donkey;

public class TestClass {
    public static void main(String[] args) {
        Movable m = new Donkey();
        m.move(10);
        m.moveBack(20);
//        System.out.println(((Donkey)m).location);
        System.out.println(m.location);
    }
}