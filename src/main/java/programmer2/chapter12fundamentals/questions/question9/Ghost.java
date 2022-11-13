package programmer2.chapter12fundamentals.questions.question9;

public class Ghost {
    public static void boo() {
        System.out.println("Not scared");
    }

    protected final class Spirit {
        public void boo() {
            System.out.println("Boo");
        }
    }

    public static void main(String[] args) {
//        var g = new Ghost().new Spirit(){};
        var g = new Ghost().new Spirit();
        g.boo();
//        g.super.boo();
        new Ghost().boo();
//        g.Ghost.boo();
//        new Spirit().boo();
        Ghost.boo();
    }
}
