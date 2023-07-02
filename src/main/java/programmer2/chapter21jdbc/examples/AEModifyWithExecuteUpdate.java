package programmer2.chapter21jdbc.examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AEModifyWithExecuteUpdate {

    // add derby.jar to class path

    public static void main(String[] args) throws SQLException {
        // add derby.jar to class path

        var inserSql = "INSERT INTO exhibits VALUES(10, 'Deer', 3)";
        var updateSql = "UPDATE exhibits SET name = '' WHERE name = 'None'";
        var deletesql = "DELETE FROM exhibits WHERE id = 10";

        Connection conn = DriverManager.getConnection("jdbc:derby:c:\\tools\\db-derby\\zoo;create=true;");

        try (var ps = conn.prepareStatement(inserSql)) {
            int result = ps.executeUpdate();
            System.out.println(result);
        }

        try (var ps = conn.prepareStatement(updateSql)) {
            int result = ps.executeUpdate();
            System.out.println(result);
        }

        try (var ps = conn.prepareStatement(deletesql)) {
            int result = ps.executeUpdate();
            System.out.println(result);
        }
    }
}
