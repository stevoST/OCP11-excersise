package programmer1.chapter8.question15;

public class Scorpion extends Arachnid {
    static {
        sb.append("q");
    }

    {
        sb.append("m");
    }

    public static void main(String[] args) {
        System.out.println(Scorpion.sb + " ");
        System.out.println(Scorpion.sb + " ");
        new Arachnid();
        new Scorpion();
        System.out.println(Scorpion.sb);
    }
}
