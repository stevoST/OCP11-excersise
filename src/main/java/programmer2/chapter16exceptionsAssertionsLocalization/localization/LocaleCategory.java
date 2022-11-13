package programmer2.chapter16exceptionsAssertionsLocalization.localization;

import java.text.NumberFormat;
import java.util.Locale;

public class LocaleCategory {
    public static void printCurrency(Locale locale, double money) {
        System.out.println(NumberFormat.getCurrencyInstance().format(money)
                + ", " + locale.getDisplayLanguage() + ":" + locale.getDisplayCountry());
    }

    public static void main(String[] args) {
        var spain = new Locale("es", "ES");
        var money = 1.23;

        Locale.setDefault(new Locale("en", "US"));
        System.out.println(Locale.getDefault());
        printCurrency(spain, money);

        System.out.println("----------");

        Locale.setDefault(Locale.Category.DISPLAY, spain);
        System.out.println(Locale.getDefault());
        printCurrency(spain, money);

        System.out.println("----------");

        Locale.setDefault(Locale.Category.FORMAT, spain);
        System.out.println(Locale.getDefault());
        printCurrency(spain, money);

        System.out.println("----------");

        Locale.setDefault(new Locale.Builder().setRegion("ES").build());
        System.out.println(Locale.getDefault());
        printCurrency(spain,money);

        System.out.println("----------");

        Locale.setDefault(new Locale.Builder().setLanguage("es").build());
        System.out.println(Locale.getDefault());
        printCurrency(spain,money);

        System.out.println("----------");

        Locale.setDefault(Locale.Category.DISPLAY, new Locale.Builder().setLanguage("es").build());
        System.out.println(Locale.getDefault());
        printCurrency(spain,money);

        System.out.println("----------");

        Locale.setDefault(Locale.Category.FORMAT, new Locale.Builder().setLanguage("es").build());
        System.out.println(Locale.getDefault());
        printCurrency(spain,money);

        System.out.println("----------");

        Locale.setDefault(new Locale("en", "US"));
        Locale.setDefault(Locale.Category.DISPLAY, new Locale.Builder().setRegion("ES").build());
        System.out.println(Locale.getDefault());
        printCurrency(spain,money);

        System.out.println("----------");

        Locale.setDefault(Locale.Category.FORMAT, new Locale.Builder().setRegion("ES").build());
        System.out.println(Locale.getDefault());
        printCurrency(spain,money);

    }
}
