package ExceptionsConcepts.Class03MyOwnsExceptions;
//creating my own exeption that will be used when the name is empty
public class EmptyNameExeption extends RuntimeException{
    String error;
    //exception constructor 
    public EmptyNameExeption(String error){
        this.error=error;
    }
    //exception getMessage
    public String getMessage(){
        return error;
    }
}
