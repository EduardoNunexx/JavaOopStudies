package OopSolidConcepts.Class11ComparatorMinMax;

import java.util.List;
import java.util.Comparator;
public class Comparatr {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1,2,3,4,5);
        //initiating the comparator
        Comparator<Integer> compair = (x,y)->{
            if(x>y) return 1; 
            if(y>x) return -1;
            return 0; 
        };
        //using min with the comparator to catch the min value
        System.out.println(integers.stream().min(compair));
        System.out.println(integers.stream().max(compair));
    }
}
