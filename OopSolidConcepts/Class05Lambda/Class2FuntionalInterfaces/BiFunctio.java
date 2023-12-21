package OopSolidConcepts.Class05Lambda.Class2FuntionalInterfaces;

import java.util.function.BiFunction;

public class BiFunctio {
    //using the biFunction interface 
    public static void main(String[] args) {
        //A bifunction recieve 2 values that can be different types and return other values that can have a different type too  
        BiFunction<Integer, Integer, String> biFunc = (a,b)->{
        int money =a+b;
        return money>=210000 ? "this bmw is yours": "Safe more money";
    };
    }
    
}
