package ExceptionsConcepts.Class02CheckedAndUnchekedExeptions;

public class CheckedAndUnckeckedExeptions {
    public static void main(String[] args) {
        //using an unchecked exception
        show(null);

        //using checked exceptions 
        //in a checked exeption you force to implements the try catch
        try {
            show2(null);
        } catch (Exception e) {
            System.out.println("Cant pass a null");
        }
        
    }


    //implementing a unchecked exception 
    static void show(String x) {
        if(x==null){
            //on a uncheked expception the type to be throwed must be or hinerit an runtimeExeption
            throw new RuntimeException("the value cant be null");
        }
        System.out.println(x);
    }
    //implementing a unchecked exception 
    static void show2(String x) throws Exception{
        if(x==null){
            throw new Exception();
        }
        System.out.println(x);
    }
}
