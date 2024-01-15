package JDBC.Class02InsertionsAndSelect.Select;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import JDBC.ConectionFactory;

public class SelectPersons01 {
    public static void main(String[] args) throws SQLException{
        //creating the conection
        Connection connection = ConectionFactory.getConnection();
        //setting the variable to recieve the query
        String sql = "SELECT * FROM persons";
        //creating the stmt 
        Statement stmt = connection.createStatement();
        //using the execute query to return the persons values 
        ResultSet result = stmt.executeQuery(sql);
        List<Person> persons = new ArrayList<>();
        while (result.next()) {
            //geting the infos about persons using the result 
            persons.add(new Person(result.getInt("tag"),result.getString("name")));
        }
        for(Person p: persons){
            System.out.println(p.getTag()+" "+p.getName());
        }
        stmt.close(); 
    }
}
