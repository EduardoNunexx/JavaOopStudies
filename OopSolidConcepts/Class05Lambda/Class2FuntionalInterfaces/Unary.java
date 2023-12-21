package OopSolidConcepts.Class05Lambda.Class2FuntionalInterfaces;

import java.util.function.UnaryOperator;

public class Unary {
    //implementing the unary interface 
    public static void main(String[] args) {
        //an unary recieves an value and return an value of the same type
        UnaryOperator<Integer> plusOne = n ->n+1;
        UnaryOperator<Integer> plusFive = n->n+5;
        //unsing and chainnig some unarys
        System.out.println(plusOne.andThen(plusFive).apply(1));
    }
    
}
