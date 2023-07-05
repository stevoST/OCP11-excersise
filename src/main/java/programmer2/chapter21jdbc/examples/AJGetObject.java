package programmer2.chapter21jdbc.examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AJGetObject {

    // add derby.jar to class path
    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:derby:c:\\tools\\db-derby\\zoo;create=true;");

        String sql = "SELECT id, name FROM exhibits";

        try (var ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Object idField = rs.getObject("id");
                Object nameField = rs.getObject("name");
                if (idField instanceof Integer) {
                    int id = (Integer) idField;
                    System.out.println(id);
                }
                if (nameField instanceof String) {
                    String name = (String) nameField;
                    System.out.println(name);
                }
            }
        }
    }
}
