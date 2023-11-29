package mockExams.test3.question33ocpjpv1123479;

class Doll{
    String name;
    Doll(String nm){
        this.name = nm;
    }
}

class Barbie extends Doll{
    Barbie(){
        super("Unknkown");//1
    }
    Barbie(String nm){
        super(nm);//2
    }
}
public class TestClass {
    public static void main(String[] args) {
        Barbie b = new Barbie("mydoll");
    }
}
