package ExceptionsConcepts.Class01Basic;

public class Eception {
    public static void main(String[] args) {
        // if i try to print a div by 0 i'll recieve a exception
        //Exception in thread "main" java.lang.ArithmeticException: / by zero
        System.out.println(7/0);
        //so i will use a way to change this exeption
        //using try and catch
        try{
            System.out.println(7/0);
        }catch(ArithmeticException x){
            System.out.println("You cant to divide by zero");
        }
        //now when a exeption ocurries in the first operation the catch will be executed
        // and will be printed You cant to divide by zero 


    }

}
