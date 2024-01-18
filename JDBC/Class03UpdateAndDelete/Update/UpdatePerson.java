package JDBC.Class03UpdateAndDelete.Update;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import JDBC.ConectionFactory;
import JDBC.Class02InsertionsAndSelect.Select.Person;

public class UpdatePerson {
    public static void main(String[] args) throws SQLException {
        Connection connection = ConectionFactory.getConnection();
        Scanner sc = new Scanner(System.in);

        System.out.println("Type the person id: ");
        int personId = sc.nextInt();
        sc.nextLine();
        String select = "SELECT * FROM persons where tag= ?";
        String update = "UPDATE persons SET name= ? WHERE tag= ?";
        PreparedStatement stmt = connection.prepareStatement(select);
        stmt.setInt(1, personId);
        ResultSet response = stmt.executeQuery();
        if (response.next()) {
            Person person = new Person(response.getInt(1), response.getString(2));
            System.out.println("The currently name of this account are " + person.getName());
            System.out.println("Type the new name: ");
            String newName = sc.nextLine();
            
            stmt.close();
            //doing the update
            //starting the new sql
            stmt= connection.prepareStatement(update);
            stmt.setString(1, newName);
            stmt.setInt(2, personId);
            stmt.execute();
        }else{
            System.out.println("Person not finded");
        }

        sc.close();
        stmt.close();
    }
}
