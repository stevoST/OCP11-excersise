package programmer2.chapter12fundamentals.questions.question25;

public class Zebra {
    private int x = 24;
    public int hunt() {
        String message = "x is ";
        abstract class Stripes {
            private int x = 0;
            public void print() {
                System.out.println(message + Zebra.this.x);
            }
        }
        var s = new Stripes() {};
        s.print();
        return x;
    }

    public static void main(String[] args) {
        System.out.println(new Zebra().hunt());;
    }
}
