package ExceptionsConcepts.Class03MyOwnsExceptions;

public class App {
    public static void main(String[] args) {
        Person p1 = new Person("o", -1);
        try {
            Validate.valid(p1);
            //using the validation one by one
        } catch (EmptyNameExeption e) {
            System.out.println(e.getMessage());
        }catch (NegativeMoneyExeption e){
            System.out.println(e.getMessage());
        }
        
    }
}
