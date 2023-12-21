package OopSolidConcepts.Class05Lambda.Class1BasicLambdaConcepts;

import java.util.function.BinaryOperator;

public class App {
    public static void main(String[] args) {
        //if i wasnt using lambda and i want to use the class method 
        Calc sum  = new Mult();
        Calc mult = new Mult();
        //using an labda function 
        //i have'nt to crate a class that have this method 
        //i just use an interface an use a lambda 
        Calc x = (a,b)->{return a+b;};
        //usign the method by the method name of the interface 
        System.out.println(x.exec(5, 2));
        //using an interface functional and a lambda function and using th other way to use an lambda expression
        Functional func =(a,b)-> a+b;
        System.out.println(func.doSomeThing(1, 2));
        //using default functional interfaces 
        BinaryOperator<Integer> binary = (a,b)-> a+b;
        System.out.println(binary.apply(1, 6));
        
    }
}
