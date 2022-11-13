package programmer2.chapter12fundamentals.questions.question7;

public class IceCream {
    enum Flavors {
        CHOCOLATE, STRAWBERRY, VANILLA
    }

    public static void main(String[] args) {
        Flavors STRAWBERRY = null;
        switch (STRAWBERRY) {
            case VANILLA:
                System.out.println("v");
            case CHOCOLATE:
                System.out.println("c");
            case STRAWBERRY:
                System.out.println("s");
                break;
            default:
                System.out.println("missing flavor");
        }
    }
}
