package ExceptionsConcepts.Class03MyOwnsExceptions;
//creating my own exception that will be used when when the name is empty
public class NegativeMoneyExeption extends RuntimeException{
    String name;
    //exception constructor 
    public NegativeMoneyExeption(String name){
        this.name= name;
    }
    //exception getMessage
    public String getMessage(){
        return name;
    }
}
