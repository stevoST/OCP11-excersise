package programmer2.chapter21jdbc.examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CreateTable {
    public static void main(String args[]) throws Exception {

        // add derby.jar to class path

        //Getting the Connection object
        String URL = "jdbc:derby:c:\\tools\\db-derby\\zoo;create=true;";
        Connection conn = DriverManager.getConnection(URL);

        //Executing the query
        String createTable = "CREATE TABLE EXHIBITS( "
                + "Id INT NOT NULL, "
                + "Name VARCHAR(255), "
                + "NUM_ACRES INT, "
                + "PRIMARY KEY (Id))";

        //Creating the Statement object
        PreparedStatement ps = conn.prepareStatement(createTable);

        ps.execute();
        System.out.println("Table created");
    }
}
