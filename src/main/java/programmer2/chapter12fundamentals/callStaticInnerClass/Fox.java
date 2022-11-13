package programmer2.chapter12fundamentals.callStaticInnerClass;

public class Fox {
    private class Den {
    }

    public void goHome() {
        new Den() {
        };
    }

    public static void visitFriend() {
//        new Den();
    }
}
