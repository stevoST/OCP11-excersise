package programmer1.chapter8.question3;


public class Platypus extends Mammal{
    int sneeze(){ return 1;}
    public Platypus(){
        super(3);
        System.out.println("Platypus");
    }

    public static void main(String[] args) {
        new Mammal(5);
    }
}
