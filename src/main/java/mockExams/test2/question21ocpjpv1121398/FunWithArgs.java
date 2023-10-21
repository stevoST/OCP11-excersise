package mockExams.test2.question21ocpjpv1121398;

public class FunWithArgs {
    public static void main(String[][] args) {
        System.out.println(args[0][1]);
    }

    public static void main(String[] args) {
        var fwa = new FunWithArgs();
        String[][] newargs = {args};
        fwa.main(newargs);
    }
}