package programmer2.chapter16exceptionsAssertionsLocalization.localization;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatPrice {
    public static void main(String[] args) {
        double price = 48;
        var myLocaleUs = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(myLocaleUs.format(price));
        var myLocaleGr = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        System.out.println(myLocaleGr.format(price));
        var myLocaleGr2 = NumberFormat.getCurrencyInstance(Locale.GERMAN);
        System.out.println(myLocaleGr2.format(price));
        var myLocaleJpn = NumberFormat.getCurrencyInstance(Locale.JAPAN);
        System.out.println(myLocaleJpn.format(price));
    }
}
