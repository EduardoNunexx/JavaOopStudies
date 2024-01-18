package JDBC.Class04DAO;

public class App {
    public static void main(String[] args) {
        DAO dao = new DAO();
        String sql = "INSERT INTO persons (name,tag) VALUES (?,?)";
        dao.insert(sql,"p1",12);
        dao.insert(sql,"p2",13);
        dao.insert(sql,"p3",14);
        dao.insert(sql,"p4",15);
        dao.closeConnection();
    }
}
