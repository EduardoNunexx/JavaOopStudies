package OopSolidConcepts.Class05Lambda.Class2FuntionalInterfaces;
//using the functional interface Predicate 

import java.util.function.Predicate;

public class Predicat {
    //using the functional interface predicate 
    public static void main(String[] args) {
        // predicate recieves a value and return an boolean
        // in this case his return will be true if i give some value bigger than 500
        Predicate<Integer> x = value -> value > 500;
        // using the predicate
        System.out.println(x.test(550));
        
    }

}
