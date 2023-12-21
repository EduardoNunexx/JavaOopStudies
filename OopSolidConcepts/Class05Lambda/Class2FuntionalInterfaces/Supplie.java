package OopSolidConcepts.Class05Lambda.Class2FuntionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Supplie {
    //using the supplier interface 
    public static void main(String[] args) {
        //an supplier recive nothing and return something that u must to expecify in the params 
        Supplier<List<String>> list = ()-> Arrays.asList("x","y","z");
        //using the Supplier
        System.out.println(list.get());
    }
}
