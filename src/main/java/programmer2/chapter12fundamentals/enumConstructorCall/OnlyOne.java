package programmer2.chapter12fundamentals.enumConstructorCall;

public enum OnlyOne {
    ONCE(true),TWICE(false);
    private OnlyOne(boolean b){
        System.out.println("constructing");
    }
}
