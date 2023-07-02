package programmer2.chapter21jdbc.examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;

public class AGAddBatch {
    public static void register(Connection conn, int firstKey, int type, String... names) throws SQLException {

        String sql = "INSERT INTO names VALUES(?, ?, ?)";
        var nextIndex = firstKey;

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(2, type);

            for (var name : names) {
                ps.setInt(1, nextIndex);
                ps.setString(3, name);
                ps.addBatch();

                nextIndex++;
            }

            int[] result = ps.executeBatch();
            System.out.println(Arrays.toString(result));
        }
    }

    public static void main(String[] args) throws SQLException {
        // add derby.jar to class path

        Connection conn = DriverManager.getConnection("jdbc:derby:c:\\tools\\db-derby\\zoo;create=true;");

        register(conn, 100, 1, "Elias", "Ester");
    }
}
