package programmer1.chapter7;


public class OverrideOrder {
    /*
    from top to bottom
    String glide(int i, int j)
    String glide(long i, long j)
    String glide(Integer i, Integer j)
    String glide(int... nums)
    */
    public static void main(String[] args) {
        System.out.println(glide(1));
    }

    static String glide(long i){
        return "long";
    }

    static String glide(Integer i){
        return "Integer";
    }
}
