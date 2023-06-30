package programmer2.chapter21jdbc.examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DropTable {
    public static void main(String args[]) throws Exception {

        // add derby.jar to class path

        //Getting the Connection object
        String URL = "jdbc:derby:c:\\tools\\db-derby\\zoo;create=true;";
        Connection conn = DriverManager.getConnection(URL);

        //Executing the query
        String dropTable = "DROP TABLE EXHIBITS";

        //Creating the Statement object
        PreparedStatement ps = conn.prepareStatement(dropTable);

        ps.execute();
        System.out.println("Table dropped");
    }
}
