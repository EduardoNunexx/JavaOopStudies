package JDBC.Class02InsertionsAndSelect.Select.Challenge;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import JDBC.ConectionFactory;
import JDBC.Class02InsertionsAndSelect.Select.Person;

public class UsingPrepered {
    public static void main(String[] args) throws SQLException{
        Scanner sc = new Scanner(System.in);
        
        Connection connection = ConectionFactory.getConnection();
        
        System.out.println("Type the letters: ");
        String name= sc.nextLine();
        
        String sql = "SELECT * FROM persons where name Like ?";
        PreparedStatement stmt = connection.prepareStatement(sql);
        
        stmt.setString(1, "%"+name+"%");
        ResultSet results =stmt.executeQuery();
        List<Person> persons= new ArrayList<>();
        while (results.next()) {
            persons.add(new Person(results.getInt("tag"),results.getString("name")));
        }
        for(Person p:persons){
            System.out.println(p.getName()+" "+p.getTag());
        }
        sc.close();
        stmt.close();
    }
}
