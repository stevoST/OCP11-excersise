package programmer2.chapter12fundamentals.staticNestedClass;

public class Enclosing {
    static class Nested {
        private static int price = 6;
    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        System.out.println(nested.price);
    }
}
