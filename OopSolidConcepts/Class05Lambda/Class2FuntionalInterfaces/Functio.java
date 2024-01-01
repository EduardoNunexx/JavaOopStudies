package OopSolidConcepts.Class05Lambda.Class2FuntionalInterfaces;

import java.util.function.Function;

public class Functio {
    //using the functional interface Function
    public static void main(String[] args) {
    //a funtction recieve a value of a type and return other value that can be of other type 
    //setting the function functional interface and passing both values types (get and exit)
    Function<Integer,String> x = value -> value%2==0 ? "Even":"Odd";
    //using the interface 
    x.apply(1);
    }

}
