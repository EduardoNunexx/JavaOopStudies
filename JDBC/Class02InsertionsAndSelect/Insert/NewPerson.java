package JDBC.Class02InsertionsAndSelect.Insert;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import JDBC.ConectionFactory;

public class NewPerson {
    public static void main(String[] args)throws SQLException {
        //stabilizing the conection 
        Connection connection = ConectionFactory.getConnection();
        //Statement stmt = connection.createStatement();

        Scanner get = new Scanner(System.in);
        System.out.println("Type your name:");
        String name = get.nextLine();
        //setting the command
        //and putting the '?'
        String sql = "INSERT INTO persons(name) VALUES(?)";
        //executing the query
        //wrong way 
        //stmt.execute(sql);
        //right way using preaperedStatement to avoid sql injection
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1, name);
        stmt.execute();
        System.out.println("everything ok !!");
        get.close();

    }
}
