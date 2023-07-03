package programmer2.chapter21jdbc.examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class AHGettingDataFromResultSet {
    public static void main(String[] args) throws SQLException {

        // add derby.jar to class path

        Connection conn = DriverManager.getConnection("jdbc:derby:c:\\tools\\db-derby\\zoo;create=true;");

        String sql = "SELECT id, name FROM exhibits";
        Map<Integer,String> idToNameMap = new HashMap<>();

        try (var ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()){

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                idToNameMap.put(id, name);
            }

            System.out.println( idToNameMap);

        }
    }
}
