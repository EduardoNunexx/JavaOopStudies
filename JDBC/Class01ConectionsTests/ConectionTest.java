import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectionTest {
    public static void main(String[] args) throws SQLException{
        //string that represents where you'll access the data base 
        //the order are jdbc:typeDataBase://locale:port
        //but how you are using the default port you dont have to do this 
        final String url="jdbc:mysql://localhost/wm";
        final String user="edn";
        final String password="saopaulo123";

        //starting the conection
        //all the import that we will do are interfaces and are from java.sql
        //driver manager are the reponsable for do the conection
        //we use the getconection do make this conection
        //this method throw an checked exception so you must to do the try
        //but to simplfy we'll throw this excetion in the start (THROWS SQLExcetion)
        Connection conection = DriverManager.getConnection(url, user, password);
        System.out.println("Great conection !   ");
        conection.close();
    }
}