package programmer2.chapter12fundamentals.questions.question24;

public class Vet {
    public static String takeNap(Yawn y) {
        return y.yawn(10, null);
    }

    public static void main(String[] args) {
        System.out.println(takeNap((a, b) -> "Sleep: " + (double) (b == null ? a : a)));
        System.out.println(takeNap((z, f) -> {
            String x = "";
            return "Sleep: " + x;
        }));
        System.out.println(takeNap((w, q) -> {
            return "Sleep: " + w;
        }));
    }
}
