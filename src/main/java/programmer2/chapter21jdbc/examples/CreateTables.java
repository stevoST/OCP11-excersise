package programmer2.chapter21jdbc.examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CreateTables {
    public static void main(String args[]) throws Exception {

        // add derby.jar to class path

        //Getting the Connection object
        String URL = "jdbc:derby:c:\\tools\\db-derby\\zoo;create=true;";
        Connection conn = DriverManager.getConnection(URL);

        //Executing the query
        String createTable = "CREATE TABLE EXHIBITS( "
                + "id INT NOT NULL, "
                + "name VARCHAR(255), "
                + "num_acres INT, "
                + "PRIMARY KEY (id))";

        String createTable2 = "CREATE TABLE Names( "
                + "id INT NOT NULL, "
                + "species_id INT, "
                + "name VARCHAR(255), "
                + "PRIMARY KEY (id))";

        //Creating the Statement object
        PreparedStatement ps = conn.prepareStatement(createTable);
        PreparedStatement ps2 = conn.prepareStatement(createTable2);

        ps.execute();
        ps2.execute();
        System.out.println("Table created");
    }
}
