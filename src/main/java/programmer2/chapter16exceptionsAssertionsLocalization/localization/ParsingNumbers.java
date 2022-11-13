package programmer2.chapter16exceptionsAssertionsLocalization.localization;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class ParsingNumbers {
    public static void main(String[] args) {
        double d = 123456.467;
        NumberFormat f1 = new DecimalFormat("###,###,###.0");
        NumberFormat f2 = new DecimalFormat("### ### ###,0");
        System.out.println(f1.format(d));
        System.out.println(f2.format(d));
    }
}
