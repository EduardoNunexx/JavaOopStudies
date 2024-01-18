package JDBC.Class03UpdateAndDelete.Delete;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import JDBC.ConectionFactory;

public class DeletePerson {
    public static void main(String[] args) throws SQLException{
        Scanner sc= new Scanner(System.in);
        System.out.println("Type the user tag that you want to delete");
        int tagDelete =sc.nextInt();
        Connection connection = ConectionFactory.getConnection();
        String sql ="DELETE FROM persons WHERE tag = ?";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setInt(1, tagDelete);
        if(stmt.executeUpdate() >0){
            System.out.println("Deleted with sucessfull");
        }else{
            System.out.println("Error tryng to delete");
        }
        stmt.close();
        sc.close();
    }
}
