package programmer2.chapter21jdbc.examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertParametersIntoDb {
    public static void register(Connection conn, int key, int type, String name) throws SQLException {

        String sql = "INSERT INTO names VALUES(?, ?, ?)";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, key);
            ps.setString(3, name);
            ps.setInt(2, type);
            ps.executeUpdate();
        }
    }

    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:derby:c:\\tools\\db-derby\\zoo;create=true;");

        register(conn,2, 3, "Elephant");
    }
}
