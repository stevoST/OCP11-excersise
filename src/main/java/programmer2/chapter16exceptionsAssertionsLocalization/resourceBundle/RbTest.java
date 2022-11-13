package programmer2.chapter16exceptionsAssertionsLocalization.resourceBundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class RbTest {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        Locale locale = new Locale("en", "CA");
        ResourceBundle rb = ResourceBundle.getBundle("Zoo", locale);
        System.out.print(rb.getString("hello"));
        System.out.print(". ");
        System.out.print(rb.getString("name"));
        System.out.print(" ");
        System.out.print(rb.getString("open"));
        System.out.print(" ");
        System.out.print(rb.getString("visitors"));
    }
}
