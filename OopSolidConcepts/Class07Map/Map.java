package OopSolidConcepts.Class07Map;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Map {
    public static void main(String[] args) {
        //using the functional interface consumer and method reference to turn more easy print
        //you could to do like this:    
        //Consumer<String> print =x-> System.out.println(x);
        Consumer<String> print =  System.out::println;  
        List<String> brands= Arrays.asList("Bmw","Mercedes","audi");
        
        //building the stram and aplyng the map
        //changing the case letter to upperCase using the map
        brands.stream().map(m->m.toUpperCase()).forEach(print);;
    }
}
