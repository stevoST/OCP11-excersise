package programmer1.chapter8.question4;

public class Cheetah extends Speedster{
    int numSpots;
    public Cheetah(int numSpots){
//        this.numSpots = numSpots;
        super.numSpots = numSpots;
    }

    public static void main(String[] args) {
        Speedster s = new Cheetah(50);
        Cheetah c = new Cheetah(50);
        System.out.println(s.numSpots);
        System.out.println(c.numSpots);
    }
}
