package programmer1.chapter8.question1;

public class BirdSeed {
    private int numberBags;
    boolean call;

    public BirdSeed(){
        //line 1
//        BirdSeed(2);
//        new BirdSeed(2);
        this(2);
        call = false;
//        this(2);
        //line 2
    }
    public BirdSeed(int numberBags){
        this.numberBags = numberBags;
    }

    public static void main(String[] args) {
        BirdSeed seed = new BirdSeed();
        System.out.println(seed.numberBags);
    }
}
