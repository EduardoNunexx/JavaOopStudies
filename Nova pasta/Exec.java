import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exec {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        BankAccount b2 = new BankAccount();
        BankAccount b3 = new BankAccount();
        BankAccount b4 = new BankAccount();
        List<BankAccount> accounts = new ArrayList<>(Arrays.asList(b1,b2,b3,b4));
        for (BankAccount bankAccount : accounts) {
            System.out.println(bankAccount.accountNumber);
        }
    }
}
