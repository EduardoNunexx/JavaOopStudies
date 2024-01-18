package JDBC;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

//just a class to create the conection easier 
public class ConectionFactory {
    public static Connection getConnection(){
        try {
            //uting the prop
            Properties prop = getProperties();
            //about the data base information we'll change this usig a .propiety later
            //setting the infos using the props keys  
            final String url=prop.getProperty("data.url");
            final String user=prop.getProperty("data.user");
            final String password=prop.getProperty("data.password");
            Connection conection = DriverManager.getConnection(url, user, password);        
            return conection;
        } catch (Exception e) { 
            throw new RuntimeException(e);
        }
        
    }

    //Setting the propertie
    private static Properties getProperties() throws IOException{
        //creating the prop
        Properties prop = new Properties();
        //setting the path of properties file
        String path ="connection.properties";
        //loading the file
        prop.load(ConectionFactory.class.getResourceAsStream(path));
        //returning the props
        return prop; 
    }
}
