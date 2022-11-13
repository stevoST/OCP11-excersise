package programmer1.chapter5;

public class StringPool {
    public static void main(String[] args) {
        String singleString = "hello world";
        String concat = "hello ";
        concat += "world";
        System.out.println(singleString==concat);
        String singleLineConcat = "hello " + "world";
        System.out.println(singleString==singleLineConcat);

        String first = "rat" + 1;
        String second = "rat1";
        System.out.println(first==second);
    }
}
