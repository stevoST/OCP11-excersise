package programmer2.chapter21jdbc.examples;

import java.sql.*;

public class AOProcedureWithOutParam {
    // add hsqldb.jar to class path

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:hsqldb:file:zoo";
        try (Connection conn = DriverManager.getConnection(url)) {
            String sql = "{?= call magic_number(?)}";
            try (CallableStatement cs = conn.prepareCall(sql)) {
                cs.registerOutParameter(1,Types.INTEGER);
                cs.execute();
                System.out.println(cs.getInt("num"));
            }
        }
    }
}
