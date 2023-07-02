package programmer2.chapter21jdbc.examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ACDropTable {
    public static void main(String args[]) throws Exception {

        // add derby.jar to class path

        //Getting the Connection object
        String URL = "jdbc:derby:c:\\tools\\db-derby\\zoo;create=true;";
        Connection conn = DriverManager.getConnection(URL);

        //Executing the query
        String dropTable = "DROP TABLE EXHIBITS";
        String dropTable2 = "DROP TABLE names";

        //Creating the Statement object
        PreparedStatement ps = conn.prepareStatement(dropTable);
        PreparedStatement ps2 = conn.prepareStatement(dropTable2);

        ps.execute();
        ps2.execute();
        System.out.println("Table dropped");
    }
}
