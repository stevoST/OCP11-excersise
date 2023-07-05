package programmer2.chapter21jdbc.examples;

import java.sql.*;

public class AMProcedureWithoutParams {

    // add hsqldb.jar to class path
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:hsqldb:file:zoo";
        try (Connection conn = DriverManager.getConnection(url)) {
            String sql = "{call read_e_names()}";
//            String sql2 = "SELECT * FROM names";
            try (CallableStatement cs = conn.prepareCall(sql);
                 ResultSet rs = cs.executeQuery()) {

                while (rs.next()){
                    System.out.println(rs.getString(3));
                }
            }
        }
    }
}
