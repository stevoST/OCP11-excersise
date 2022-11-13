package programmer1.chapter3;

public class Casting {
    public static void main(String[] args) {
        long longVal = 3;
        double doubleVal = longVal;
        int ticketsSold = 3;
        ticketsSold += (long) 1;
        byte inc = (byte) -200;
        System.out.println(inc);
        System.out.println(ticketsSold);
        System.out.println(((Object) ticketsSold).getClass().getName());
    }
}
