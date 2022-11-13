package programmer1.chapter8.question21;

public class Parrot extends Bird{
    protected Parrot(int y) {super(y);}
    protected Parrot fly(){
        return new Parrot(2);
    }
}
