package programmer1.chapter8.question20;

public class Lizard extends Reptile {
    static {
        System.out.println("B");
    }

    {
        System.out.println("C");
    }

    public Lizard(int hatch) {
    }

    public final void layEggs() {
        System.out.println("Lizard");
    }

    public static void main(String[] args) {
        Reptile reptile = new Lizard(1);
        reptile.layEggs();
    }
}
