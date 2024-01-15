package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

//just a class to create the conection easier 
public class ConectionFactory {
    public static Connection getConnection(){
        try {
            //about the data base information we'll change this usig a .propiety later 
            final String url="jdbc:mysql://localhost/newDB";
            final String user="edn";
            final String password="saopaulo123";
            Connection conection = DriverManager.getConnection(url, user, password);        
            return conection;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        
    }
}
