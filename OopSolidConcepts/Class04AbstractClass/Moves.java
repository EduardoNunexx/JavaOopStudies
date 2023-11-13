package OopSolidConcepts.Class04AbstractClass;
//using the default method 
public interface Moves {
    default void run(){
        System.out.println("Runing");
    }
}
