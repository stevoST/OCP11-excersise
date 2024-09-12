package mockExams.test7.question45ocpjpv1123572.p2;

import mockExams.test7.question45ocpjpv1123572.p1.Movable;

public class Donkey implements Movable {
    /*public*/ int location = 200;

    public void move(int by) {
        location = location + by;
    }

    public void moveBack(int by) {
        location = location - by;
    }
}