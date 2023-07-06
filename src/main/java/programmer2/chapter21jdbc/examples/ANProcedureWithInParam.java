package programmer2.chapter21jdbc.examples;

import java.sql.*;

public class ANProcedureWithInParam {
    // add hsqldb.jar to class path
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:hsqldb:file:zoo";
        try (Connection conn = DriverManager.getConnection(url)) {
            String sql = "{call read_names_by_letter(?)}";
            try (CallableStatement cs = conn.prepareCall(sql)) {
                // prefix is name for variable in procedure. defined in ALHSQLdbSetup.java
                cs.setString("prefix", "Z");
//                cs.setString(1, "Z");
                try (ResultSet rs = cs.executeQuery()) {
                    while (rs.next()) {
                        System.out.println(rs.getString(3));
                    }
                }
            }
        }
    }
}
