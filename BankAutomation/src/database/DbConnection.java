package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DbConnection {

    private final String HOST = "localhost";
    private final String PORT = "3306";
    private final String DbName = "PhiBank";
    private final String USER = "root";
    private final String PASSWORD = "";

    protected Connection connection = null;
    protected Statement statement = null;

    public DbConnection() {
   
        String url = "jdbc:mysql://" + this.HOST + ":" + this.PORT + "/" + this.DbName 
                + "?useSSL=false&serverTimezone=UTC";

        try {
            // Using the new driver class `com.mysql.cj.jdbc.Driver`
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            // Establishing the connection
            this.connection = DriverManager.getConnection(url, this.USER, this.PASSWORD);
            System.out.println("Connection Success");
        } catch (SQLException ex) {
            System.out.println("Connection failed");
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
