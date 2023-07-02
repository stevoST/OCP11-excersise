package programmer2.chapter21jdbc.examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AFReadWithExecuteUpdate {
    public static void main(String[] args) throws SQLException {
        // add derby.jar to class path

        var sql = "SELECT * FROM exhibits";

        Connection conn = DriverManager.getConnection("jdbc:derby:c:\\tools\\db-derby\\zoo;create=true;");

        try (var ps = conn.prepareStatement(sql)){
            ResultSet rs = ps.executeQuery();
        }

    }
}
