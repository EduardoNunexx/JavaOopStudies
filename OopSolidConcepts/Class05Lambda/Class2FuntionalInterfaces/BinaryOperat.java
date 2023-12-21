package OopSolidConcepts.Class05Lambda.Class2FuntionalInterfaces;

import java.util.function.BinaryOperator;

//using the functional interface BinaryOperator
public class BinaryOperat {
    public static void main(String[] args) {
        //this interface recive 2 values and return a same type value 
        BinaryOperator<Integer> binary = (x,y)-> x+y;
        System.out.println(binary.apply(1,9));
    }
    

}
