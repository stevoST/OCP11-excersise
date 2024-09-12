package mockExams.test4.question6ocpjpv1121099;

public class TestClass{
    public static void main(String args[]){
        int x  = 0;
        labelA:   for (var i=10; i<0; i--){
//        labelA:   for (var i=10; i>0; i--){
            var j = 0;
            labelB:
            while (j < 10){
                if (j > i) break labelB;
                if (i == j){
                    x++;
                    continue labelA;
                }
                j++;
            }
            x--;
        }
        System.out.println(x);
    }
}