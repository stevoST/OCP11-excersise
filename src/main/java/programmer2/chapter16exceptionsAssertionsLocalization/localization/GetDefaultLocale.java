package programmer2.chapter16exceptionsAssertionsLocalization.localization;

import java.util.Locale;

public class GetDefaultLocale {
    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        System.out.println(locale);
        Locale locale_fr = new Locale("fr", "FR");
        Locale.setDefault(locale_fr);
        Locale newLocale = Locale.getDefault();
        System.out.println(newLocale);

    }
}
