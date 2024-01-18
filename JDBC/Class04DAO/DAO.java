package JDBC.Class04DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import JDBC.ConectionFactory;

public class DAO {
    private Connection connection;
    public int insert(String sql, Object... values){
        try {
            PreparedStatement stmt = getConnection().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            addValues(stmt, values);
            if(stmt.executeUpdate()>0){
                ResultSet rSet = stmt.getGeneratedKeys();
                if(rSet.next()){
                    return rSet.getInt(1) ;
                }
            }
            return -1;
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void addValues (PreparedStatement stmt, Object[] values) throws SQLException{
        int i =1;
        for(Object x: values){ 
            if(x instanceof String){
                stmt.setString(i,(String) x);
            }else if(x instanceof Integer){
                stmt.setInt(i,(Integer) x);
            }
            i++;
        }
    }
    private Connection getConnection(){
        try {
            if (connection!=null && !connection.isClosed()) {
                return connection;
            }
        } catch (Exception e) {
            
        }
        connection = ConectionFactory.getConnection();
        return connection;
    }
    public void closeConnection(){
        try {
            getConnection().close();
        } catch (SQLException e) {
            
        }finally{
            connection = null;
        }
        
    }
}
