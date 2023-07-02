package programmer2.chapter21jdbc.examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AAConnectionToDb {

    public static void main(String[] args) throws SQLException {
        // add derby.jar to class path
        Connection conn = DriverManager.getConnection("jdbc:derby:c:\\tools\\db-derby\\zoo;create=true;");
        System.out.println(conn);
    }
}
