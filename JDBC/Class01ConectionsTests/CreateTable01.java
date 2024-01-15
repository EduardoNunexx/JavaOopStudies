import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import JDBC.ConectionFactory;

public class CreateTable01 {
    public static void main(String[] args) throws SQLException{
        Connection connection = ConectionFactory.getConnection();
        String sql ="CREATE TABLE persons("
                    +"tag INT AUTO_INCREMENT PRIMARY KEY,"
                    +"name VARCHAR(80) NOT NULL"
                    +")";
        Statement stmt = connection.createStatement();
        stmt.execute(sql);
        connection.close(); 
    }
}
