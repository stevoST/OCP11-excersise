package programmer2.chapter16exceptionsAssertionsLocalization.propertyClass;

import java.util.Properties;

public class PropertyClass {
    public static void main(String[] args) {
        var props = new Properties();
        props.setProperty("name","our zoo");
        props.setProperty("open", "10am");

        System.out.println(props.getProperty("camel"));
        System.out.println(props.getProperty("camel", "Bob"));
        System.out.println(props.getProperty("open", "never"));
        System.out.println(props.get("name"));
    }
}
