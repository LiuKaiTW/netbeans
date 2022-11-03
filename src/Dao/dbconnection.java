package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class dbconnection {

    public static void main(String[] args) {
        System.out.println(dbconnection.getDB());
    }
    public static Connection getDB()
    {
        Connection conn=null;
        String url="jdbc:mysql://localhost:3306/account";
        String user="root";
        String password="1234";      
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection(url, user, password);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(dbconnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(dbconnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
}