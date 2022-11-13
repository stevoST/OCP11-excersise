package programmer2.chapter16exceptionsAssertionsLocalization.localization;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Dates {
    public static void print(DateTimeFormatter dtf,
                             LocalDateTime dateTime, Locale locale) {
        System.out.println(dtf.format(dateTime) + ", " + dtf.withLocale(locale).format(dateTime));
    }

    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        var italy = new Locale("it", "IT");
        var dt = LocalDateTime.of(2020, Month.OCTOBER, 20, 15,12,34);

        print(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG), dt, italy);
        print(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT), dt, italy);
        print(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT), dt, italy);
    }
}
