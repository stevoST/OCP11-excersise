package programmer2.chapter16exceptionsAssertionsLocalization.localization;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class PriceFormat {
    public static void main(String[] args) throws ParseException {
        String income = "$92,807.99";
        NumberFormat cf = NumberFormat.getCurrencyInstance(Locale.US);
        double value = (Double) cf.parse(income);
        System.out.println(value);
    }
}
