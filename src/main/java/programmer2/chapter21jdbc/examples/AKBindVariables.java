package programmer2.chapter21jdbc.examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AKBindVariables {

    // add derby.jar to class path

    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:derby:c:\\tools\\db-derby\\zoo;create=true;");

        var sql = "SELECT id FROM exhibits Where name = ?";

        try (var ps = conn.prepareStatement(sql)) {
            ps.setString(1, "Zebra");
            try (var rs = ps.executeQuery()) {
                while(rs.next()){
                    int id = rs.getInt("id");
                    System.out.println(id);
                }
            }
        }
    }
}
