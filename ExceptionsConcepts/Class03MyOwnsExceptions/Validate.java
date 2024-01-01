package ExceptionsConcepts.Class03MyOwnsExceptions;

public class Validate {
    public static void valid(Person p){
        if(p.name== null || p.name.trim().isEmpty()){
            throw new EmptyNameExeption("Name is empty");
        }
        if (p.money<0) {
            throw new NegativeMoneyExeption("Negative amount of money");
        }
    }
}
