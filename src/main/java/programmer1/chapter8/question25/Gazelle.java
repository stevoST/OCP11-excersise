package programmer1.chapter8.question25;

public class Gazelle extends Antelope{
    public Gazelle(int p){
        super(6);
        System.out.println("3");
    }

    public static void main(String hopping[]) {
        new Gazelle(0);
    }
    static {
        System.out.println("8");
    }
    {
        System.out.println("9");
    }
}
