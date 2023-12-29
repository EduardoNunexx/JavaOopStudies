package OopSolidConcepts.Class10Match;

import java.util.List;
import java.util.function.Predicate;

public class Match {
    //the matchs work to compair with the list pass for some evaluation
    public static void main(String[] args) {
        List<Integer> integers = List.of(1,2,3,4,5,6,7,8);
        //declaring the predicate to use wih match
        Predicate<Integer> biggerThan = x-> x>=0;

        //allMatch
        //using the ALLmatch to check if the values are bigger than 0
        System.out.println(integers.stream().allMatch(biggerThan));

        //anyMatch
        //using AnyMatch to check if some value are bigger tha 0
        System.out.println(integers.stream().anyMatch(biggerThan));

        //anyMatch
        //using nonyMatch to check if none value are bigger tha 0
        System.out.println(integers.stream().noneMatch(biggerThan));

    }
    
    
    
}
