package programmer1.chapter9.castinginterfaces;

public class BadCasts{
    public static void main(String[] args) {
        Canine canine = new Wolf();
        Canine badDog = (Dog)canine;
    }
}
