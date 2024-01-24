import java.sql.Connection;
import java.sql.Statement;

import JDBC.ConectionFactory;

public class CreateDataBase {
    public static void main(String[] args){
        //doing the conection
        /*final String url="jdbc:mysql://localhost";
        final String user = "edn";
        final String password = "saopaulo123";

        Connection conection = DriverManager.getConnection(url, user, password);

        //creating the statment
        Statement stmt =conection.createStatement();
        //doing the comand to create the data base
        stmt.execute("CREATE DATABASE newDB");
        
        conection.close();*/
        Connection connection = ConectionFactory.getConnection();
        try {
            Statement stmt = connection.createStatement();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        
        
    }
}
