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
        public int[] runningSum(int[] nums) {
            int aux=0;
            int aux2=0;
            int[] newNumbers=  new int[nums.length];
            for(int x:nums){
                aux+=x;
                newNumbers[aux2]=aux;
                aux2++;
            }
            return newNumbers;
        }
        public int maximumWealth(int[][] accounts) {
            int richiest=0;
            for (int i = 0; i < accounts[0].length; i++) {
                richiest+=accounts[0][i];
            }
            for (int i = 1; i < accounts.length; i++) {
                for (int j = 0; j < accounts[i].length; j++) {
                    if(accounts[i][j]>richiest){
                        richiest=accounts[i][j];
                    }
                }
            }
            return richiest;
        }
}
