package mockExams.test6.question13ocpjpv1121050;

public class Question13 {
    public static void main(String args[]){
        var i = 0;
        for (i=1 ;  i<5  ; i++) continue;  //(1)
        for (i=0 ;       ; i++) break;       //(2)
        for (    ; i<5?false:true ;    );     //(3)
    }
}
