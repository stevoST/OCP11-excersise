package mockExams.test2.question42ocpjpv1121057;

public class Question42 {
    public static void main(String[] args) {
        var c = 0;
        JACK: while (c < 8){
            JILL:
            {
                System.out.println(c);
                if (c > 3) break JILL;
                else c++;
            }
        }
    }
}
