package programmer2.chapter16exceptionsAssertionsLocalization.questions.question16;

public class On {
    public static void main(String[] args) {
        String s = null;
        int check = 10;
        assert s != null : check++;
        System.out.println(check);
    }
}
